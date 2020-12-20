package com.harunugur.events.publisher;

import com.harunugur.events.event.CustomSpringEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Async
    public void publishCustomEvent(final String message) {
        try {
            Thread.sleep(5000);
            CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
            applicationEventPublisher.publishEvent(customSpringEvent);
            System.out.println("Publishing custom event. ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
