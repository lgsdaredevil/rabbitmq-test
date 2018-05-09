package com.rabbit.rabbitmqtest;

import com.rabbit.rabbitmqtest.service.Receiver;
import com.rabbit.rabbitmqtest.service.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqTestApplicationTests {

	@Autowired
    private Sender sender;

	@Autowired
    private Receiver receiver;


	@Test
    public void hello() throws Exception{
	    sender.send();
    }


	@Test
	public void contextLoads() {
	}

}
