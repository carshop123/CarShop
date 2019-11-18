package com.dt.userserver.conf;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/9 0009
 * @since v1.0
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced // 启用 Ribbon 负载均衡
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 实现分发策略接口的创建
     *
     * @return IRule 分发策略 负载轮询的算法
     */
    @Bean
    public IRule setRule() {
        // 分片策略
        // 负载均衡算法之 轮询
//        return new RetryRule();
        // 最小 并发
        return new BestAvailableRule();
    }
}
