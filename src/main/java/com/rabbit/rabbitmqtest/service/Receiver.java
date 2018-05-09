package com.rabbit.rabbitmqtest.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author gsliu
 * @date 2018-05-09 14:34
 */
@Component
@RabbitListener(queues = "h1")
public class Receiver {

    @RabbitHandler
    public void receive(String hello){
        System.out.print(hello);
    }


}
