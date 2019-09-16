```
$ docker-compose up kafka-cluster
Starting code2_kafka-cluster_1 ... done
Attaching to code2_kafka-cluster_1
kafka-cluster_1  | Setting advertised host to 127.0.0.1.
kafka-cluster_1  | Operating system RAM available is 1467 MiB, which is less than the lowest
kafka-cluster_1  | recommended of 5120 MiB. Your system performance may be seriously impacted.
kafka-cluster_1  | Starting services.
kafka-cluster_1  | This is landoop’s fast-data-dev. Kafka 0.11.0.0, Confluent OSS 3.3.0.
kafka-cluster_1  | You may visit http://127.0.0.1:3030 in about a minute.
kafka-cluster_1  | 2019-09-09 13:28:04,302 CRIT Supervisor running as root (no user in config file)
kafka-cluster_1  | 2019-09-09 13:28:04,302 WARN Included extra file "/etc/supervisord.d/01-zookeeper.conf" during parsing
kafka-cluster_1  | 2019-09-09 13:28:04,302 WARN Included extra file "/etc/supervisord.d/02-broker.conf" during parsing
kafka-cluster_1  | 2019-09-09 13:28:04,302 WARN Included extra file "/etc/supervisord.d/03-schema-registry.conf" during parsing
kafka-cluster_1  | 2019-09-09 13:28:04,302 WARN Included extra file "/etc/supervisord.d/04-rest-proxy.conf" during parsing
kafka-cluster_1  | 2019-09-09 13:28:04,302 WARN Included extra file "/etc/supervisord.d/05-connect-distributed.conf" during parsing
kafka-cluster_1  | 2019-09-09 13:28:04,302 WARN Included extra file "/etc/supervisord.d/06-caddy.conf" during parsing
kafka-cluster_1  | 2019-09-09 13:28:04,302 WARN Included extra file "/etc/supervisord.d/07-smoke-tests.conf" during parsing
kafka-cluster_1  | 2019-09-09 13:28:04,302 WARN Included extra file "/etc/supervisord.d/08-logs-to-kafka.conf" during parsing
kafka-cluster_1  | 2019-09-09 13:28:04,302 WARN Included extra file "/etc/supervisord.d/99-supervisord-sample-data.conf" during parsing
kafka-cluster_1  | 2019-09-09 13:28:04,304 INFO supervisord started with pid 8
kafka-cluster_1  | 2019-09-09 13:28:05,308 INFO spawned: 'sample-data' with pid 98
kafka-cluster_1  | 2019-09-09 13:28:05,310 INFO spawned: 'zookeeper' with pid 99
kafka-cluster_1  | 2019-09-09 13:28:05,315 INFO spawned: 'caddy' with pid 100
kafka-cluster_1  | 2019-09-09 13:28:05,318 INFO spawned: 'broker' with pid 102
kafka-cluster_1  | 2019-09-09 13:28:05,322 INFO spawned: 'smoke-tests' with pid 103
kafka-cluster_1  | 2019-09-09 13:28:05,326 INFO spawned: 'connect-distributed' with pid 105
kafka-cluster_1  | 2019-09-09 13:28:05,329 INFO spawned: 'logs-to-kafka' with pid 107
kafka-cluster_1  | 2019-09-09 13:28:05,332 INFO spawned: 'schema-registry' with pid 114
kafka-cluster_1  | 2019-09-09 13:28:05,335 INFO spawned: 'rest-proxy' with pid 116
kafka-cluster_1  | 2019-09-09 13:28:06,310 INFO success: sample-data entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
kafka-cluster_1  | 2019-09-09 13:28:06,310 INFO success: zookeeper entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
kafka-cluster_1  | 2019-09-09 13:28:06,314 INFO success: caddy entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
kafka-cluster_1  | 2019-09-09 13:28:06,343 INFO success: broker entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
kafka-cluster_1  | 2019-09-09 13:28:06,343 INFO success: smoke-tests entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
kafka-cluster_1  | 2019-09-09 13:28:06,343 INFO success: connect-distributed entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
kafka-cluster_1  | 2019-09-09 13:28:06,343 INFO success: logs-to-kafka entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
kafka-cluster_1  | 2019-09-09 13:28:06,344 INFO success: schema-registry entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
kafka-cluster_1  | 2019-09-09 13:28:06,344 INFO success: rest-proxy entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
kafka-cluster_1  | 2019-09-09 13:28:07,996 INFO exited: schema-registry (exit status 1; not expected)
kafka-cluster_1  | 2019-09-09 13:28:07,999 INFO spawned: 'schema-registry' with pid 318
kafka-cluster_1  | 2019-09-09 13:28:08,125 INFO exited: rest-proxy (exit status 1; not expected)
kafka-cluster_1  | 2019-09-09 13:28:08,128 INFO spawned: 'rest-proxy' with pid 352
kafka-cluster_1  | 2019-09-09 13:28:09,242 INFO success: schema-registry entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
kafka-cluster_1  | 2019-09-09 13:28:09,242 INFO success: rest-proxy entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
```

<img width=600 src="https://user-images.githubusercontent.com/44635266/64534957-6a418000-d351-11e9-8712-abe67477e051.png">
