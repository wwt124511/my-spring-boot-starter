package com.wwt.starter.starter1;

import lombok.Data;

/**
 * @Author wwt
 * @ClassName MsgService.java
 * @Description TODO
 * @CreateTime 2023-01-14 22:54
 */
@Data
public class MsgService {

    private String url;

    private String content;

    public String sendMsg() {
        System.out.println("**********消息发送成功，地址=" + url + "，内容=" + content + "");
        return "消息发送成功，地址=" + url + "，内容=" + content + "";
    }
}
