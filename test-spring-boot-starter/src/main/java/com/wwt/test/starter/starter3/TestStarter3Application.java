package com.wwt.test.starter.starter3;

import com.wwt.demo.starter.starter3.EnableStarter3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author wwt
 * @ClassName TestStarterApplication.java
 * @Description TODO
 * @CreateTime 2023-01-11 23:50
 */
@EnableStarter3
@SpringBootApplication
public class TestStarter3Application {

    public static void main(String[] args) {
        SpringApplication.run(TestStarter3Application.class, args);
    }

}
