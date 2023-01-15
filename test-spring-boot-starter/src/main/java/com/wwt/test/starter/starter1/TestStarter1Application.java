package com.wwt.test.starter.starter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author wwt
 * @ClassName TestStarterApplication.java
 * @Description TODO
 * @CreateTime 2023-01-11 23:50
 */
@SpringBootApplication
//该注解不加就获取不到Starter1Service，因为springboot默认只扫描启动类根目录下的包及其子包，必须手动引入jar路径才行
@ComponentScan({"com.wwt.demo.starter.starter1","com.wwt.test.starter.starter1"})
public class TestStarter1Application {

    public static void main(String[] args) {
        SpringApplication.run(TestStarter1Application.class, args);
    }

}
