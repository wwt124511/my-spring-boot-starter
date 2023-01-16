package com.wwt.test.starter.starter6.controller;

import com.wwt.demo.starter.starter6.Starter6Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wwt
 * @ClassName Starter6TestController.java
 * @Description TODO
 * @CreateTime 2023-01-16 17:02
 */
@Slf4j
@RestController
@RequestMapping("/starter6")
public class Starter6TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/test0601")
    @ResponseBody
    public Object test0601(){
        Starter6Service starter6Service = applicationContext.getBean("starter6Service", Starter6Service.class);
        starter6Service.hello();
        return "成功";
    }

}
