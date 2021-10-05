package com.example.SpringEvents;

import com.example.SpringEvents.Config.AppConfig;
import com.example.SpringEvents.EventPublisher.Netflix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventDemo {
    public static void main(String[] args) {
        System.out.println("hellp");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Netflix bean = applicationContext.getBean("netflix", Netflix.class);
        bean.streamSeries(1);
    }
}
