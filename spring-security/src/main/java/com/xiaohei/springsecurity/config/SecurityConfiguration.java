package com.xiaohei.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2022/4/13 6:50 下午
 * @Describtion 认证请求拦截配置
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Override
//    @Bean
//    public UserDetailsService userDetailsServiceBean() throws Exception {
//        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
//        userDetailsManager.createUser(User.withUsername("xiaohei").password("123").authorities("p1").build());
//        userDetailsManager.createUser(User.withUsername("xiaohei2").password("1234").authorities("p2").build());
//        return userDetailsManager;
//    }

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
//        return NoOpPasswordEncoder.getInstance();
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
