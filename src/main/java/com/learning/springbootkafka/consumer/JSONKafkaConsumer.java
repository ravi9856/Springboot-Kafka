package com.learning.springbootkafka.consumer;

import com.learning.springbootkafka.Controllers.Emp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JSONKafkaConsumer {

    @KafkaListener(topics = "Custom-JSON-Topic-1", groupId = "consumer-group-1")
    public void consume(Emp emp){
        log.info("Consuming JSON message from Kafka:" + emp);

    }

}
