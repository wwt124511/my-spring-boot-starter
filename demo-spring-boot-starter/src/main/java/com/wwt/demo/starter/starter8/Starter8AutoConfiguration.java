package com.wwt.demo.starter.starter8;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * @Author wwt
 * @ClassName Starter8AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-16 18:11
 */
@Slf4j
@AutoConfiguration
@ConditionalOnClass(name = "com.wwt.demo.starter.starter8.InitStarter8Service")
public class Starter8AutoConfiguration {

    @Bean
    public Starter8Service starter8Service(){
        log.info("=============容器初始化Starter8Service==============");
        return new Starter8Service();
    }

}
