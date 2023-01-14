package com.wwt.controller;

import com.wwt.starter.starter1.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private MsgService msgService;

    @GetMapping("/test0101")
    public Object test0101(){
        msgService.sendMsg();
        return "成功";
    }


}
