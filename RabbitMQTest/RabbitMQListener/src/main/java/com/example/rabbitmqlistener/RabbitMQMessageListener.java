package com.example.rabbitmqlistener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {    // message is injected by spring amqp or rabbitmq
        System.out.println("MESSAGE = " + new String(message.getBody()) + " ENDED");
    }
}
