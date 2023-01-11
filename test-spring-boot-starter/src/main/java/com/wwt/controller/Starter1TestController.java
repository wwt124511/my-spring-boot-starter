package com.wwt.controller;

import com.wwt.starter.starter1.HellowordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
    private HellowordService hellowordService;

    @PostMapping("test01")
    public Object test01(){
        hellowordService.hello();
        return "";
    }


}
