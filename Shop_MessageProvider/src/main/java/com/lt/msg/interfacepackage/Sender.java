package com.lt.msg.interfacepackage;

import com.dt.common.vo.Result;
import com.lt.msg.conf.RabbitMQConfig;
import com.lt.msg.service.SendMsgByQueue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/17 0017
 * @since v1.0
 */
@RestController
public class Sender {
    @Autowired
    SendMsgByQueue service;

    @RequestMapping("/messages/rabbitMQ/sendByQueueAndExchange")
    public Result sendStr() {

        service.send(RabbitMQConfig.RESERVER_WASH_CAR_QUEUE, "测试发送");
        return Result.setOK("1");
    }
}
