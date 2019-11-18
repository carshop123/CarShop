package com.lt.msg.service.impl;

import com.lt.msg.service.SendMsgByQueue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/18 0018
 * @since v1.0
 */
@Service
public class SendMsgByQueueImpl implements SendMsgByQueue {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void send(String reserverWashCarQueue, String msg) {
        rabbitTemplate.convertAndSend(reserverWashCarQueue, msg);
    }
}
