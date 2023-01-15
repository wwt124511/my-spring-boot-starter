package com.wwt.demo.starter.starter4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wwt
 * @ClassName Starter4AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-15 21:54
 */
@Slf4j
@Configuration
public class Starter4AutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(name={"starter4Service"})
    public Starter4Service starter4Service(){
        log.info("============容器启动时初始化Starter4Service==============");
        return new Starter4Service();
    }


}
