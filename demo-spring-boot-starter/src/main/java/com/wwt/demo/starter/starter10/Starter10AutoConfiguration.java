package com.wwt.demo.starter.starter10;

import com.wwt.demo.starter.starter9.Starter9Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @Author wwt
 * @ClassName Starter10AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-16 18:11
 */
@Slf4j
@AutoConfiguration
@EnableConfigurationProperties(Starter10Properties.class)
//模拟redis-starter的加载方式。
//类路劲下只要存在Starter10Operations.class该类就会加载该配置类。也就是引入这个jar包后就会自动加载这个配置类
@ConditionalOnClass(Starter10Operations.class)
public class Starter10AutoConfiguration {

    @Bean
    public Starter10Service starter10Service(){
        log.info("=============容器初始化Starter10Service==============");
        return new Starter10Service();
    }

}
