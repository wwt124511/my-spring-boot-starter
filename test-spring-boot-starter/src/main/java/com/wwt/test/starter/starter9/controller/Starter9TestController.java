package com.wwt.test.starter.starter9.controller;

import com.wwt.demo.starter.starter9.Starter9Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wwt
 * @ClassName Starter9TestController.java
 * @Description TODO
 * @CreateTime 2023-01-16 17:02
 */
@Slf4j
@RestController
@RequestMapping("/starter9")
public class Starter9TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/test0901")
    @ResponseBody
    public Object test0601(){
        Starter9Service starter9Service = applicationContext.getBean("starter9Service", Starter9Service.class);
        starter9Service.hello();
        return "成功";
    }

}
