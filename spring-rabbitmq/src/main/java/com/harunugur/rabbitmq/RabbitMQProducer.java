package com.harunugur.rabbitmq;

import com.harunugur.model.Blog;
import com.harunugur.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQProducer {

    @Autowired
    private RabbitMQService rabbit;

    @RequestMapping(value = "/send",method = RequestMethod.POST)
    public String send() {
        Blog blog = Blog.builder()
                .id(1L)
                .name("Wordpress")
                .url("www.wordpress.com")
                .build();

        rabbit.send(blog);
        return "Message sended...";
    }
}
