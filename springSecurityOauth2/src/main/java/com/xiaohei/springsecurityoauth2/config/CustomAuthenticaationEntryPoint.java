package com.xiaohei.springsecurityoauth2.config;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/2 8:01 下午
 * @Version 1.0
 * 自定义401错误展示信息
 */
@Component
public class CustomAuthenticaationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.sendError(HttpServletResponse.SC_ACCEPTED,"Access Denied");
    }
}
