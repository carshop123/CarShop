package com.dt.common.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redisson(){
        // 使用yaml格式的配置文件，读取使用Config.fromYAML，如果是Json文件，则使用Config.fromJSON
        System.out.println(RedissonConfig.class.getClassLoader().getResource("redisson-config.yml").getPath());
        Config config = null;
        try {
            config = Config.fromYAML(RedissonConfig.class.getClassLoader().getResource("redisson-config.yml"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("配置文件出错");
        }
        assert config != null;
        return Redisson.create(config);
    }
}
