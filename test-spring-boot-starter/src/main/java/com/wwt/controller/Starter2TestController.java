package com.wwt.controller;

import com.wwt.starter.starter1.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wwt
 * @ClassName Starter2TestController.java
 * @Description TODO
 * @CreateTime 2023-01-14 23:02
 */
@RestController
@RequestMapping("/starter2")
public class Starter2TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @PostMapping("test0201")
    public Object test01(){

        MsgService msgService = applicationContext.getBean(MsgService.class);
        System.out.println("msgService=" + msgService);
        return "成功";
    }
}
