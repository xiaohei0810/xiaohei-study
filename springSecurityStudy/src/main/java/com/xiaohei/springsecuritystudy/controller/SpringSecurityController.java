package com.xiaohei.springsecuritystudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/30 2:44 下午
 * @Version 1.0
 */
@RestController
public class SpringSecurityController {

    @RequestMapping("/")
    public String login() {
        return "login success";
    }

    @RequestMapping("/vip1/{id}")
    public String vip1Login(@PathVariable("id") String id) {
        return "vip1 login success" + id;
    }

    @RequestMapping("/vip2/{id}")
    public String vip2Login(@PathVariable("id") String id) {
        return "vip2 login success" + id;
    }

    @RequestMapping("/actuator/{id}")
    public String actuatorLogin(@PathVariable("id") String id) {
        return "actuator login success" + id;
    }

    @RequestMapping("/oauth/{id}")
    public String oauthLogin(@PathVariable("id") String id) {
        return "oauth login success" + id;
    }

    @RequestMapping("/user")
    public String userLogin() {
        return "userLogin login success";
    }

}
