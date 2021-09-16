package com.smartmi.deploymentenvironment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/20 4:36 下午
 * @Version 1.0
 */
@RestController
@RequestMapping("/laoshiren")
public class SpringBootDockerJenkins {

    @GetMapping("/xiaohei")
    public String test(){
        return "访问成功！";
    }

}
