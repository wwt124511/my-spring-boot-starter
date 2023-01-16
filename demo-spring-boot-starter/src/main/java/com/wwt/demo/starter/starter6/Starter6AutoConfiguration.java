package com.wwt.demo.starter.starter6;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;

/**
 * @Author wwt
 * @ClassName Starter6AutoConfiguration.java
 * @Description TODO
 * @CreateTime 2023-01-16 16:42
 */
@Slf4j
@AutoConfiguration
//判断类路径下是否存在InitStarter6这个类，如果不存在则加载当前自动化配置类并创建Starter6Service bean对象
//注意：此处不要用即将要创建对象的类，这样永远不会创建，因为永远都能扫描到
@ConditionalOnMissingClass(value={"com.wwt.demo.starter.starter6.InitStarter6"})
public class Starter6AutoConfiguration {

    @Bean
    public Starter6Service starter6Service(){
        log.info("===============容器初始化Starter6Service=============");
        return new Starter6Service();
    }
}
