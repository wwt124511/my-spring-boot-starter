package com.wwt.starter2.controller;

import com.wwt.starter.starter2.Starter2Service;
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
@RequestMapping("/starter2")
public class Starter2TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/test0201")
    @ResponseBody
    public Object test0201(){
        Starter2Service starter2Service = applicationContext.getBean("starter2Service", Starter2Service.class);
        starter2Service.hello();
        return "成功";
    }

}
