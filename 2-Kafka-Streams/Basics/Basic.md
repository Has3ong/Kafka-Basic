```
$ kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic streams-plaintext-input
Created topic streams-plaintext-input.

kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic streams-wordcount-output
Created topic streams-wordcount-output.

$ kafka-console-producer --broker-list localhost:9092 --topic streams-plaintext-input
>Kafka First
>Kafak Second
>Kafka Third
>^C%

$ kafka-console-consumer --bootstrap-server localhost:9092 --topic streams-plaintext-input --from-beginning
Kafka First
Kafak Second
Kafka Third

$ kafka-console-consumer --bootstrap-server localhost:9092 \
    --topic streams-wordcount-output \
    --from-beginning \
    --formatter kafka.tools.DefaultMessageFormatter \
    --property print.key=true \
    --property print.value=true \
    --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer \
    --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer


$ kafka-run-class org.apache.kafka.streams.examples.wordcount.WordCountDemo
[2019-09-09 22:11:05,579] WARN The configuration 'admin.retries' was supplied but isn't a known config. (org.apache.kafka.clients.consumer.ConsumerConfig)
[2019-09-09 22:11:05,580] WARN The configuration 'admin.retry.backoff.ms' was supplied but isn't a known config. (org.apache.kafka.clients.consumer.ConsumerConfig)

kafka	1
first	1
kafak	1
second	1
kafka	2
third	1
```