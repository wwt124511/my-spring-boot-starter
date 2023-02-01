package com.wwt.test.starter.starter10.controller;

import com.wwt.demo.starter.starter10.Starter10Service;
import com.wwt.demo.starter.starter9.Starter9Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wwt
 * @ClassName Starter10TestController.java
 * @Description TODO
 * @CreateTime 2023-01-16 17:02
 */
@Slf4j
@RestController
@RequestMapping("/starter10")
public class Starter10TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/test1001")
    @ResponseBody
    public Object test0601(){
        Starter10Service starter10Service = applicationContext.getBean("starter10Service", Starter10Service.class);
        starter10Service.hello();
        return "成功";
    }

}
