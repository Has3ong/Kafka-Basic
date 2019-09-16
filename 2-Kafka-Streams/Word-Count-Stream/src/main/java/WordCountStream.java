import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KStreamBuilder;
import org.apache.kafka.streams.kstream.KTable;

import java.util.Arrays;
import java.util.Properties;

public class WordCountApp {
    public static void main(String[] args) {

        /*
            $ kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 2 --topic word-count-input
            $ kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 2 --topic word-count-output

            $ kafka-console-consumer --bootstrap-server localhost:9092 \
                --topic word-count-output \
                --from-beginning \
                --formatter kafka.tools.DefaultMessageFormatter \
                --property print.key=true \
                --property print.value=true \
                --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer \
                --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer

            $ kafka-console-producer --broker-list localhost:9092 --topic word-count-input

            Run WordCountApp.java
         */

        Properties config = new Properties();
        config.put(StreamsConfig.APPLICATION_ID_CONFIG, "wordcount-application");
        config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        config.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        config.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        KStreamBuilder builder = new KStreamBuilder();

        KStream<String, String> textLines = builder.stream("word-count-input");
        KTable<String, Long> wordCounts = textLines
                .mapValues(textLine -> textLine.toLowerCase())
                .flatMapValues(textLine -> Arrays.asList(textLine.split("\\W+")))
                .selectKey((key, word) -> word)
                .groupByKey()
                .count("Counts");

        wordCounts.to(Serdes.String(), Serdes.Long(), "word-count-output");

        KafkaStreams streams = new KafkaStreams(builder, config);
        streams.start();

        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

        while(true){
            System.out.println(streams.toString());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
