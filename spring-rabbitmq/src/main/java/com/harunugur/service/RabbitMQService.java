package com.harunugur.service;

import com.harunugur.model.Blog;

public interface RabbitMQService {
    void send(Blog blog);
}
