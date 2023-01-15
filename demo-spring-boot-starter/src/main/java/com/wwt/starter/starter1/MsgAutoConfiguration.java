package com.wwt.starter.starter1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wwt
 * @ClassName MsgAutoConfiguration.java
 * @Description 测试
 * @CreateTime 2023-01-14 22:55
 */
@Configuration
@ConditionalOnMissingClass({"com.wwt.starter.starter1.InitMsg"})
public class MsgAutoConfiguration {

    @Bean
    public MsgService msgService(){
        System.out.println("初始化MsgService");
        return new MsgService();
    }
}
