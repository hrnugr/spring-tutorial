package com.harunugur.resttemplate.controller;

import com.harunugur.resttemplate.domain.Covid19;
import com.harunugur.resttemplate.service.Covid19ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Covid19Controller {

    @Autowired
    private Covid19ServiceImp covid19ServiceImp;

    @RequestMapping(value = "/summary")
    public ResponseEntity<Covid19> getSummary(){

        return new ResponseEntity<>(covid19ServiceImp.fetchAll(), HttpStatus.OK);
    }
}
