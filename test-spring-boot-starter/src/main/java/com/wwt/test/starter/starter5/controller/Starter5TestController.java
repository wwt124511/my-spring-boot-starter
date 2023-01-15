package com.wwt.test.starter.starter5.controller;

import com.wwt.demo.starter.starter5.Starter5Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wwt
 * @ClassName Starter5TestController.java
 * @Description TODO
 * @CreateTime 2023-01-14 23:02
 */
@Slf4j
@RestController
@RequestMapping("/starter5")
public class Starter5TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/test0501")
    @ResponseBody
    public Object test0301(){
        Starter5Service starter5Service = applicationContext.getBean("starter5Service", Starter5Service.class);
        starter5Service.hello();
        return "成功";
    }

}
