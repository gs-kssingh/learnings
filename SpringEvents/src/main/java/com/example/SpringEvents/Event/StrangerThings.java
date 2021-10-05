package com.example.SpringEvents.Event;

import org.springframework.context.ApplicationEvent;

public class StrangerThings extends ApplicationEvent {

    private int episodeNo;

    public StrangerThings(Object source) {
        super(source);
    }

    public StrangerThings(Object source, int episodeNo) {
        super(source);
        this.episodeNo = episodeNo;
    }

    public int getEpisodeNo() {
        return episodeNo;
    }
}
