package com.lt.msg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/18 0018
 * @since v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient //注册服务
@EntityScan(basePackages = {"com.td.pojo.pojos","com.dt.common.dto"}) //扫描映射类所在的包  原因：实体类和持久层没有在一个项目
public class MessagesApplication {
    public static void main(String[] args) {
        SpringApplication.run(MessagesApplication.class, args);
    }
}
