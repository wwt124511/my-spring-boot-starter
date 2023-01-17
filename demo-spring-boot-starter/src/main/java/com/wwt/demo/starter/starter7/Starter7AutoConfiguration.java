package com.wwt.demo.starter.starter7;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * @Author wwt
 * @ClassName Starter7AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-16 18:11
 */
@Slf4j
@AutoConfiguration
//@ConditionalOnMissingBean(name = "starter7Service")
public class Starter7AutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(name = "starter7Service")
    public Starter7Service starter7Service(){
        log.info("=============容器初始化Starter7Service==============");
        return new Starter7Service();
    }

}
