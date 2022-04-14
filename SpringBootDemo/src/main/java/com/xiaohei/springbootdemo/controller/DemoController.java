package com.xiaohei.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/20 3:50 下午
 * @Version 1.0
 * @Describtion
 */
@RestController
@RequestMapping("/xiaohei")
public class DemoController {

    @GetMapping("/test")
    public String test(){
        return "welcome to xiaohei";
    }

}
