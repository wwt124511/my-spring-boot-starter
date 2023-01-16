package com.wwt.test.starter.starter7.controller;

import com.wwt.demo.starter.starter7.Starter7Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wwt
 * @ClassName Starter7TestController.java
 * @Description TODO
 * @CreateTime 2023-01-16 17:02
 */
@Slf4j
@RestController
@RequestMapping("/starter7")
public class Starter7TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/test0701")
    @ResponseBody
    public Object test0601(){
        Starter7Service starter7Service = applicationContext.getBean("starter7Service", Starter7Service.class);
        starter7Service.hello();
        return "成功";
    }

}
