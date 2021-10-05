package com.example.SpringEvents.EventListener;

import com.example.SpringEvents.Event.PeakyBlinders;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Subscriber3 {

    @EventListener
    public void subscribeToPeakyBlinders(PeakyBlinders event) {
        watchPeakyBlinders(event.getEpisodeNo());
    }

    public void watchPeakyBlinders(int episodeNo) {
        System.out.println("Subscriber 3 is watching PB episode: " + episodeNo);
    }
}
