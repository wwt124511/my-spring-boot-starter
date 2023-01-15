package com.wwt.starter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author wwt
 * @ClassName TestStarterApplication.java
 * @Description TODO
 * @CreateTime 2023-01-11 23:50
 */
@SpringBootApplication
//@ComponentScan({"com.wwt.starter","com.wwt"}) 测试starter1使用的注解
public class TestStarter3Application {

    public static void main(String[] args) {
        SpringApplication.run(TestStarter3Application.class, args);
    }

}
