package com.lt.msg.listeren;

import com.lt.msg.conf.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * 处理接收到的 消息
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/7 0007
 * @since v1.0
 */
@Component
@RabbitListener(queues = RabbitMQConfig.RESERVER_WASH_CAR_QUEUE)
public class MQListener {
    /**
     * // rabbitMQ处理消息
     *
     * @param msg 监听到的消息
     */
    @RabbitHandler
    public void handlerMessages(String msg) {

        System.out.println(msg);
        //
        //System.out.println("OK");
    }
}
