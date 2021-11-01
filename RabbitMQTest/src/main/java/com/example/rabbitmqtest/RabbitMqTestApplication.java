package com.example.rabbitmqtest;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqTestApplication implements CommandLineRunner {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleMessage simpleMessage = new SimpleMessage();
        simpleMessage.setName("Sohan");
        simpleMessage.setDesc("Associate SE at Gainsight");
        rabbitTemplate.convertAndSend("TestExchange", "testRouting", "Hello from Spring");  // sends the message to exchange which has RoutedQueue binded to it using the routingKey

    }
}
