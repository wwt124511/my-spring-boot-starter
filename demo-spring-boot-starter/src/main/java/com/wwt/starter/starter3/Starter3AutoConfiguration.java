package com.wwt.starter.starter3;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * @Author wwt
 * @ClassName Starter3AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-11 14:09
 */
@AutoConfiguration
@ConditionalOnClass(EnableStarter3.class)
public class Starter3AutoConfiguration {

    @Bean
    public Starter3Service hellowordService(){
        return new Starter3Service();
    }


}
