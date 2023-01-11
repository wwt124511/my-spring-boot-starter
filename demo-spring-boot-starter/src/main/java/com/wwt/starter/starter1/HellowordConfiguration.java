package com.wwt.starter.starter1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wwt
 * @ClassName HellowordConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-11 14:09
 */
@Configuration
public class HellowordConfiguration {

    @Bean
    public HellowordService hellowordService(){
        return new HellowordService();
    }


}
