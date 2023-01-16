package com.wwt.test.starter.starter7.config;

import com.wwt.demo.starter.starter7.Starter7Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wwt
 * @ClassName MyStarter7AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-16 18:20
 */
@Slf4j
//注意：此处不能用@AutoConfiguration，否则不会自动加载。@AutoConfiguration是和imports结合一起用的。
//正常项目里面如果要自动化加载配置还是要用@Configuration
@Configuration
public class MyStarter7AutoConfiguration {

    @Bean
    public Starter7Service starter7Service(){
        log.info("==============初始化自定义的Starter7Service==============");
        return new Starter7Service("name002");
    }

}
