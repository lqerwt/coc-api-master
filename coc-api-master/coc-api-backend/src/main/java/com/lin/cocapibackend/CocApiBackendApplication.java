package com.lin.cocapibackend;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 主类（项目启动入口）
 *
 * @author lin
 */
// todo 如需开启 Redis，须移除 exclude 中的内容
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@MapperScan("com.lin.cocapibackend.mapper")
@EnableScheduling
@EnableDubbo
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)

public class CocApiBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CocApiBackendApplication.class, args);
    }

}
