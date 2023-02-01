package com.wwt.demo.starter.starter10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author wwt
 * @ClassName Starter10Service.java
 * @Description TODO
 * @CreateTime 2023-01-16 18:12
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Starter10Service {

    @Autowired
    private Starter10Properties starter10Properties;

    public void hello(){
        log.info("你好，我是spring-boot-starter10! name:{}", starter10Properties.getName());
    }
}
