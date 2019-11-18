package com.dt.userserver.web;

import com.dt.common.vo.Result;
import com.dt.userserver.service.MqService;
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
public class TestMQ {

    @Autowired
    MqService service;

    @RequestMapping("/api/rabbitMQ/sendByQueueAndExchange")
    public Result sendStr(){
      return service.sendStr();
    }
}
