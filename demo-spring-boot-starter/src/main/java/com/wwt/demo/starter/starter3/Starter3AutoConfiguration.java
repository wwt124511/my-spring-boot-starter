package com.wwt.demo.starter.starter3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * @Author wwt
 * @ClassName Starter3AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-11 14:09
 */
@Slf4j
@AutoConfiguration
@ConditionalOnClass(EnableStarter3.class)
public class Starter3AutoConfiguration {

    @Bean
    public Starter3Service starter3Service(){
        log.info("=============容器启动时初始化Starter3Service==========");
        return new Starter3Service();
    }


}
