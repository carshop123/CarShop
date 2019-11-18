package com.dt.userserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/17 0017
 * @since v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient //注并发现服务
@EnableFeignClients // 标明这里是 客户端
@EnableSwagger2
public class UserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication.class, args);
    }
}
