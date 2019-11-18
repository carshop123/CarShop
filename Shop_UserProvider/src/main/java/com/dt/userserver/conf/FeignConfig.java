package com.dt.userserver.conf;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator luotuan
 */
@Configuration
public class FeignConfig {
    public int connectTime = 10000;
    public int readTime = 10000;

    @Bean
    public Request.Options createOP() {
        return new Request.Options(connectTime, readTime);
    }

    /**
     * 设置Feign 的重试次数
     *
     * @return Retryer
     */
    @Bean
    public Retryer createRetryer() {
        return new Retryer.Default(60, 110, 3);
    }
}
