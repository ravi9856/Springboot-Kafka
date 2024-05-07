package com.learning.springbootkafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "Custom-Topic-1", groupId = "consumer-group-1")
    public void consume(String message){
        log.info("Consuming message from Kafka:" + message);
    }
}
