package com.rabbit.rabbitmqtest.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author gsliu
 * @date 2018-05-09 14:35
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue mqQueue(){
        return new Queue("h1");
    }

}
