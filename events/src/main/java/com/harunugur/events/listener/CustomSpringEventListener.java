package com.harunugur.events.listener;


import com.harunugur.events.event.CustomSpringEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {

    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        try {
            Thread.sleep(5000);
            System.out.println("Received spring custom event - " + event.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
