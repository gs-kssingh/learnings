package com.example.SpringEvents.EventPublisher;

import com.example.SpringEvents.Event.PeakyBlinders;
import com.example.SpringEvents.Event.StrangerThings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Netflix{

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void streamSeries(int episodeNo) {
        System.out.println("Streaming Stranger Things episode :" + episodeNo);
        applicationEventPublisher.publishEvent(new StrangerThings(this, episodeNo));
        System.out.println("Streaming Peaky Blinders episode :" + episodeNo);
        applicationEventPublisher.publishEvent(new PeakyBlinders(episodeNo));
    }

}
