package com.harunugur.resttemplate.service;

import com.harunugur.resttemplate.domain.Covid19;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.harunugur.resttemplate.utils.Consts.*;

@Service
public class Covid19ServiceImp implements Covid19Service{

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Covid19 fetchAll() {
        ResponseEntity<Covid19> summary = restTemplate.getForEntity(URL, Covid19.class);
        return summary.getBody();
    }
}

