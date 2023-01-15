package com.wwt.test.starter.starter4.controller;

import com.wwt.demo.starter.starter4.Starter4Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wwt
 * @ClassName Starter4TestController.java
 * @Description TODO
 * @CreateTime 2023-01-14 23:02
 */
@Slf4j
@RestController
@RequestMapping("/starter4")
public class Starter4TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/test0401")
    @ResponseBody
    public Object test0301(){
        Starter4Service starter4Service = applicationContext.getBean("starter4Service", Starter4Service.class);
        starter4Service.hello();
        return "成功";
    }

}
