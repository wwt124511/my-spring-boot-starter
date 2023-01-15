package com.wwt.starter1.controller;

import com.wwt.starter.starter1.Starter1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wwt
 * @ClassName Starter1TestController.java
 * @Description TODO
 * @CreateTime 2023-01-11 23:51
 */
@RestController
@RequestMapping("/starter1")
public class Starter1TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/test0101")
    public Object test0101(){
        Starter1Service starter1Service = applicationContext.getBean("starter1Service", Starter1Service.class);
        starter1Service.hello();
        return "成功";
    }


}
