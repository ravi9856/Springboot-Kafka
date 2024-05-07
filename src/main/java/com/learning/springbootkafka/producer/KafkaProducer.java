package com.learning.springbootkafka.producer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class KafkaProducer {

//    Constructor is required to initial below.
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

//    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }

    public void sendKafkaMessage(String message){
        log.info("Message Sent to Kafka: " + message);
        kafkaTemplate.send("Custom-Topic-1", message);

    }
}
