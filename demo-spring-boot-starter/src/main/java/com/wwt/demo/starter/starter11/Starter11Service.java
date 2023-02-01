package com.wwt.demo.starter.starter11;

import com.wwt.demo.starter.starter10.Starter10Properties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author wwt
 * @ClassName Starter11Service.java
 * @Description TODO
 * @CreateTime 2023-01-16 18:12
 */
@Slf4j
@Data
public class Starter11Service {

    public void hello(){
        log.info("你好，我是spring-boot-starter11!");
    }
}
