package com.xiaohei.springsecurityoauth2.controller;

import com.xiaohei.springsecurityoauth2.config.UserLogoutSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2022/4/12 5:22 下午
 * @Describtion
 */
@RestController
@RequestMapping(value = "/oauth")
public class LogoutController {

    @Autowired
    private UserLogoutSuccessHandler logoutSuccessHandler;

    @GetMapping("/logout")
    public void exit(@RequestHeader("authorization") String authorization) {
        // 退出登陆,撤除令牌token
        logoutSuccessHandler.onLogoutSuccess(authorization);
    }

    @GetMapping("/logout2")
    public String bb() {
        // 退出登陆,撤除令牌token
        System.out.println("111");
        return "1";
    }

}
