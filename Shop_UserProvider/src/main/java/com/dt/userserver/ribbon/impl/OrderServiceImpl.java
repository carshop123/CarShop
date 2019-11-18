package com.dt.userserver.ribbon.impl;

import com.dt.common.vo.Result;
import com.dt.userserver.ribbon.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Ribbon
 * 实现服务消费者
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/9 0009
 * @since v1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    /**
     * 注入 RestTemplate
     */
    @Autowired
    RestTemplate restTemplate;

}
