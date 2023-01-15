package com.wwt.starter.starter2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wwt
 * @ClassName Starter2AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-15 17:11
 */
@Slf4j
@Configuration
public class Starter2AutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(name={"starter2Service"})
    public Starter2Service starter2Service(){
        log.info("容器启动时初始化Starter2Service");
        return new Starter2Service();
    }


}
