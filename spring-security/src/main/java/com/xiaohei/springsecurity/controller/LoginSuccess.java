package com.xiaohei.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2022/4/14 9:54 上午
 * @Describtion
 */
@RestController
public class LoginSuccess {

    @PostMapping("/login-success")
    public String loginSuccess(){
        return "登陆成功";
    }

    @GetMapping("/r/r1")
    public String r1(){
        return "r1访问成功";
    }

    @PostMapping("/r/r2")
    public String r2(){
        return "r2访问成功";
    }

}
