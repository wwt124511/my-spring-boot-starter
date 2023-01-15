package com.wwt.test.starter.starter3.controller;

import com.wwt.demo.starter.starter3.Starter3Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wwt
 * @ClassName Starter2TestController.java
 * @Description TODO
 * @CreateTime 2023-01-14 23:02
 */
@Slf4j
@RestController
@RequestMapping("/starter3")
public class Starter3TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/test0301")
    @ResponseBody
    public Object test0301(){
        Starter3Service starter3Service = applicationContext.getBean("starter3Service", Starter3Service.class);
        starter3Service.hello();
        return "成功";
    }

}
