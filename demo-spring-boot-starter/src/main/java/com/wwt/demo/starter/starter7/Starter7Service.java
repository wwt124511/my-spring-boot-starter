package com.wwt.demo.starter.starter7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author wwt
 * @ClassName Starter7Service.java
 * @Description TODO
 * @CreateTime 2023-01-16 18:12
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Starter7Service {

    private String name = "name001";

    public void hello(){
        log.info("你好，我是spring-boot-starter7!");
        log.info("name=" + name);
    }
}
