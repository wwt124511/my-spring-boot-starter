package com.wwt.demo.starter.starter6;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author wwt
 * @ClassName Starter6Service.java
 * @Description TODO
 * @CreateTime 2023-01-16 16:44
 */
@Slf4j
@Data
public class Starter6Service {

    public void hello(){
        log.info("你好，我是spring-boot-starter6!");
    }

}
