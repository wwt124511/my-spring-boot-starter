package com.wwt.controller;

import com.wwt.starter.starter2.HellowordService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired(required = false)
    private HellowordService hellowordService;

    @PostMapping("test0201")
    public Object test01(){
        hellowordService.hello();
        return "";
    }
}
