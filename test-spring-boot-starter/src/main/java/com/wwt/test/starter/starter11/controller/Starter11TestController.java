package com.wwt.test.starter.starter11.controller;

import com.wwt.demo.starter.starter10.Starter10Service;
import com.wwt.demo.starter.starter11.Starter11Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wwt
 * @ClassName Starter11TestController.java
 * @Description TODO
 * @CreateTime 2023-01-16 17:02
 */
@Slf4j
@RestController
@RequestMapping("/starter11")
public class Starter11TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/test1101")
    @ResponseBody
    public Object test0601(){
        Starter11Service starter11Service = applicationContext.getBean("starter11Service", Starter11Service.class);
        starter11Service.hello();
        return "成功";
    }

}
