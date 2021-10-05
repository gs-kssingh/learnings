package com.example.SpringEvents.EventListener;

import com.example.SpringEvents.Event.StrangerThings;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Subscriber1 implements ApplicationListener<StrangerThings> {
    @Override
    public void onApplicationEvent(StrangerThings event) {
        watchStrangerThings(event.getEpisodeNo());
    }

    public void watchStrangerThings(int episodeNo) {
        System.out.println("Subscriber 1 is watching ST episode: " + episodeNo);
    }

}
