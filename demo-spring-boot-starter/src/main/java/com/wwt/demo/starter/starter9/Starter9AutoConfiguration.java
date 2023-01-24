package com.wwt.demo.starter.starter9;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * @Author wwt
 * @ClassName Starter9AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-16 18:11
 */
@Slf4j
@AutoConfiguration
//havingValue  可与name组合使用，比较获取到的属性值与havingValue给定的值是否相同，相同才加载配置
//matchIfMissing  缺少该配置属性时是否可以加载。如果为true，没有该配置属性时也会正常加载；反之则不会生效
@ConditionalOnProperty(prefix = "com.wwt", name = "starter9", havingValue = "true")
public class Starter9AutoConfiguration {

    @Bean
    public Starter9Service starter9Service(){
        log.info("=============容器初始化Starter9Service==============");
        return new Starter9Service();
    }

}
