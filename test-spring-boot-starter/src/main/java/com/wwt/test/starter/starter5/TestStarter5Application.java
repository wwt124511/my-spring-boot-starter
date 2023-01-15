package com.wwt.test.starter.starter5;

import com.wwt.demo.starter.starter5.EnableStarter5;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author wwt
 * @ClassName TestStarter5Application.java
 * @Description TODO
 * @CreateTime 2023-01-11 23:50
 */
@EnableStarter5
@SpringBootApplication
public class TestStarter5Application {

    public static void main(String[] args) {
        SpringApplication.run(TestStarter5Application.class, args);
    }

}
