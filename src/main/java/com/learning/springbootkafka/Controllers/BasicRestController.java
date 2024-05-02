package com.learning.springbootkafka.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testController")
@Slf4j
public class BasicRestController {

    @GetMapping("/hello")
    public ResponseEntity<?> helloWorld(){
        log.info("Hello World!!");
        return new ResponseEntity<>("Hello World!!", HttpStatus.OK);
    }
}
