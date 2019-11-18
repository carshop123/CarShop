package com.lt.recourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
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
@EnableSwagger2
@EnableEurekaClient
public class RecourseApplication {
    public static void main(String[] args) {
        SpringApplication.run(RecourseApplication.class, args);
    }
}
