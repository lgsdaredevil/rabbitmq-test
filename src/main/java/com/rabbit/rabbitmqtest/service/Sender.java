package com.rabbit.rabbitmqtest.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author gsliu
 * @date 2018-05-09 14:34
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "Hello" + new Date();
        System.out.print("Sender:" + context);
        amqpTemplate.convertAndSend("h1", context);
    }


}
