package com.wwt.starter.starter1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wwt
 * @ClassName MsgAutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-14 22:55
 */
@Configuration
public class MsgAutoConfiguration {

    @Bean
    @ConditionalOnMissingClass({"com.wwt.starter.starter1.MsgService"})
    public MsgService msgService(){
        return new MsgService();
    }
}
