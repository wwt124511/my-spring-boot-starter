package com.wwt.test.starter.starter1.controller;

import com.wwt.demo.starter.starter1.Starter1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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
    private ApplicationContext applicationContext;

    /**
     * @Author wwt
     * @Description 测试通过自动化配置初始化bean方式，不过这种方式不灵活，不能重写。
     * @Param
     * @Return
     * @CreateTime 2023-01-15 18:55
     */
    @GetMapping("/test0101")
    public Object test0101(){
        Starter1Service starter1Service = applicationContext.getBean("starter1Service", Starter1Service.class);
        starter1Service.hello();
        return "成功";
    }


}
