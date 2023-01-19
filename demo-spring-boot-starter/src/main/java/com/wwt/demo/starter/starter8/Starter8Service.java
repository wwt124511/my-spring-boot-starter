package com.wwt.demo.starter.starter8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author wwt
 * @ClassName Starter8Service.java
 * @Description TODO
 * @CreateTime 2023-01-16 18:12
 */
@Slf4j
@Data
public class Starter8Service {

    public void hello(){
        log.info("你好，我是spring-boot-starter8!");
    }
}
