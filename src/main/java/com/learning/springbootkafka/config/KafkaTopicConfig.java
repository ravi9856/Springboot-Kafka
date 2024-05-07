package com.learning.springbootkafka.config;

import com.learning.springbootkafka.Controllers.Emp;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@Configuration
public class KafkaTopicConfig {

//    Make it a Bean
    @Bean
    public NewTopic customTestTopic(){
        return TopicBuilder.name("Custom-Topic-1")
//                .partitions(10) //Optional
                .build();
    }

    @Bean
    public NewTopic customJSONTopic(){
        return TopicBuilder.name("Custom-JSON-Topic-1")
//                .partitions(10) //Optional
                .build();
    }

}
