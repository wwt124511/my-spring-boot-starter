package com.wwt.demo.starter.starter11;

import com.wwt.demo.starter.starter1.Starter1Service;
import com.wwt.demo.starter.starter10.Starter10Operations;
import com.wwt.demo.starter.starter10.Starter10Properties;
import com.wwt.demo.starter.starter10.Starter10Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @Author wwt
 * @ClassName Starter11AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-16 18:11
 */
@Slf4j
@AutoConfiguration
@ConditionalOnResource(resources = {"init11.txt"})
public class Starter11AutoConfiguration {

    @Bean
    public Starter11Service starter11Service(){
        log.info("=============容器初始化Starter11Service==============");
        return new Starter11Service();
    }

}
