package com.wwt.test.starter.starter2.config;

import com.wwt.demo.starter.starter2.Starter2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wwt
 * @ClassName Starter2Configuration.java
 * @Description TODO
 * @CreateTime 2023-01-15 19:07
 */
@Slf4j
@Configuration
public class Starter2Configuration {

    @Bean
    public Starter2Service starter2Service(){
        log.info("=================重载Starter2Service对象================");
        return new Starter2Service();
    }

}
