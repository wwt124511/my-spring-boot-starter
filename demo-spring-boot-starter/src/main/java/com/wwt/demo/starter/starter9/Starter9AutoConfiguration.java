package com.wwt.demo.starter.starter9;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * @Author wwt
 * @ClassName Starter9AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-16 18:11
 */
@Slf4j
@AutoConfiguration
@ConditionalOnProperty(prefix = "com.wwt", name = "login", havingValue = "true")
public class Starter9AutoConfiguration {

    @Bean
    public Starter9Service starter9Service(){
        log.info("=============容器初始化Starter9Service==============");
        return new Starter9Service();
    }

}
