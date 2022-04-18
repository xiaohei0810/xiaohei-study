package com.xiaohei.springsecurityoauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.InMemoryAuthorizationCodeServices;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.Objects;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2022/4/13 6:50 下午
 * @Describtion 认证请求拦截配置
 */
@Configuration
@EnableWebSecurity
@Order(2)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    @Bean
    public UserDetailsService userDetailsServiceBean() throws Exception {
        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
        userDetailsManager.createUser(User.withUsername("xiaohei").password("$2a$10$598CwOsN.Vw8KlaffTc6VuwBILFC7/MieVxTyIwQh5jQRmDAFZw4i").authorities("p1").build());
        userDetailsManager.createUser(User.withUsername("xiaohei2").password("1234").authorities("p2").build());
        return userDetailsManager;
    }

    /**
     * 安全拦截机制
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/r/r1").hasAuthority("p1") // 访问/r/r1 url需要用户有p1权限
                .antMatchers("/r/r2").hasAuthority("p2") // 访问/r/r2 url需要用户有p2权限
                .antMatchers("/r/**").authenticated() // 访问/r/** 的路径都要经过授权
                .anyRequest().permitAll() // 除了这些路径不需要授权
                .and()
                .formLogin()
                .successForwardUrl("/login-success");
    }

    /**
     * 密码编码器
     * @return
     */
//    @Bean
//    public PasswordEncoder passwordEncoder() {
////        return new MessageDigestPasswordEncoder("SHA-1");
//        return new PasswordEncoder() {
//            @Override
//            public String encode(CharSequence charSequence) {
//                return charSequence.toString();
//            }
//
//            @Override
//            public boolean matches(CharSequence charSequence, String s) {
//                return Objects.equals(charSequence.toString(),s);
//            }
//        };
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public AuthorizationCodeServices authorizationCodeServices() throws Exception {
        return new InMemoryAuthorizationCodeServices();
    }


}
