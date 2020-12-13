package com.harunugur.service;

import com.harunugur.config.RabbitMQConfig;
import com.harunugur.model.Blog;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements RabbitMQService {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Autowired
    private RabbitMQConfig config;

    @Override
    public void send(Blog blog) {
        rabbitTemplate.convertAndSend(config.getExchange(), config.getRoutingkey(), blog);
    }

}
