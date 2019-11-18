package com.dt.userserver.service;

import com.dt.common.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/17 0017
 * @since v1.0
 */
@FeignClient(value = "MessagesServer")
public interface MqService {

    @RequestMapping("/messages/rabbitMQ/sendByQueueAndExchange")
    Result sendStr();
}
