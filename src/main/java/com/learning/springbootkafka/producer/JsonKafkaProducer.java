package com.learning.springbootkafka.producer;

import com.learning.springbootkafka.Controllers.Emp;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class JsonKafkaProducer {

    @Autowired
    KafkaTemplate<String, Emp> kafkaTemplate;

    public void sendMessage(Emp emp){
        Message<Emp> message = MessageBuilder
                .withPayload(emp)
                .setHeader(KafkaHeaders.TOPIC, "Custom-JSON-Topic-1")
                .build();
        log.info("JSON Message Sent to Kafka: " + message);
        kafkaTemplate.send(message);
    }
}
