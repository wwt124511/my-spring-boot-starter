package com.wwt.demo.starter.starter1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wwt
 * @ClassName Starter1AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-15 17:37
 */
@Slf4j
@Configuration
public class Starter1AutoConfiguration {

    @Bean
    public Starter1Service starter1Service(){
        log.info("============容器启动时初始化Starter1Service=========");
        return new Starter1Service();
    }
}
