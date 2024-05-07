package com.learning.springbootkafka.Controllers;

import com.learning.springbootkafka.producer.JsonKafkaProducer;
import com.learning.springbootkafka.producer.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafkaController")
@Slf4j
public class BasicRestController {

    @Autowired
    KafkaProducer kafkaProducer;

    @Autowired
    JsonKafkaProducer jsonKafkaProducer;

    @GetMapping("/sendKafkaMessage")
    public ResponseEntity<?> sendKafkaMessage(@RequestParam String message){
        log.info("Sending Message to Kafka");
        kafkaProducer.sendKafkaMessage(message);
        return new ResponseEntity<>("Message sent to Kafka", HttpStatus.OK);
    }

    @GetMapping("/sendJSONKafkaMessage")
    public ResponseEntity<?> sendJSONKafkaMessage(@RequestBody Emp message){
        log.info("Sending JSON Message to Kafka: " + message);
        jsonKafkaProducer.sendMessage(message);
        return new ResponseEntity<>("JSON Message sent to Kafka", HttpStatus.OK);
    }
}
