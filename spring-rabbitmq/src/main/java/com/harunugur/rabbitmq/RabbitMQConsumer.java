package com.harunugur.rabbitmq;

import com.harunugur.model.Blog;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitMQConsumer {

    private Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @RabbitListener(queues = "${app.rabbitmq.queue}")
    public void recieveMessage(Blog blog) {
        LOGGER.info("Received Blog : " + blog.toString());

    }
}
