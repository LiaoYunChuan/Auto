package com.longruan.aotu.realData.mq.send.impl;

import com.longruan.aotu.realData.mq.send.SendService;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendServiceImpl implements SendService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void send(String exchange, byte[] data) {
        MessageProperties messageProperties = new MessageProperties();
        Message message = new Message(data, messageProperties);
        rabbitTemplate.send(exchange,null,message);
    }
}
