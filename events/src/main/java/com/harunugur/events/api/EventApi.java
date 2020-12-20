package com.harunugur.events.api;

import com.harunugur.events.publisher.CustomSpringEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventApi {
    @Autowired
    private CustomSpringEventPublisher customSpringEventPublisher;

    @RequestMapping(value = "/event/{message}",method = RequestMethod.POST)
    public void event(@PathVariable String message){
        customSpringEventPublisher.publishCustomEvent(message);
    }
}
