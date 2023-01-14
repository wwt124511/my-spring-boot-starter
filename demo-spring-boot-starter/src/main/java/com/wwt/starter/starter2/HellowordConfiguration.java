package com.wwt.starter.starter2;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * @Author wwt
 * @ClassName HellowordConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-11 14:09
 */
@AutoConfiguration
@ConditionalOnClass(EnableHelloword.class)
public class HellowordConfiguration {

    @Bean
    public HellowordService hellowordService(){
        return new HellowordService();
    }


}
