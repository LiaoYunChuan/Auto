package com.longruan.aotu.data.mq.send;

public interface SendService {

    /**
     * 发送rabbitMQ消息
     * @param exchange 交换器
     * @param data 消息
     */
    void send(String exchange, byte[] data);
}
