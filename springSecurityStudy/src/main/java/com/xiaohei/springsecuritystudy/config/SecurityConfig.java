package com.xiaohei.springsecuritystudy.config;

import com.xiaohei.springsecuritystudy.service.ZhimiUserDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/30 2:57 下午
 * @Version 1.0
 * 认证请求拦截配置
 */
@Slf4j
@EnableWebSecurity
@Order(2)
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final Log logger = LogFactory.getLog(SecurityConfig.class);


    /**
     * 请求拦截认证规则，需要对哪些请求进行拦截进行认证和放行。
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        this.logger.debug("Using default configure(HttpSecurity). "
                + "If subclassed this will potentially override subclass configure(HttpSecurity).");
//        http.authorizeRequests()
//                .antMatchers("/vip1/**")
//                .hasRole("xiaohei1")
//                .antMatchers("/vip2/**")
//                .hasRole("role1");
        http.requestMatchers()//使HttpSecurity接收以"/login/","/oauth/"开头请求。
                .antMatchers("/oauth/**", "/login/**", "/logout/**", "/actuator/**,/user")
                .and()
                .authorizeRequests()
                .antMatchers("/oauth/**").authenticated()
                .and()
                .formLogin()
//                .loginPage("/login") 自定义登录页
                .defaultSuccessUrl("/confirm").and()
                .logout().deleteCookies("cookie");

        http.formLogin();
    }

    /**
     * 认证：注意spring security 5.0以后需要配置密码解析器passwordEncoder支持。
     * 请求拦截进行用户登陆走到这里进行用户身份验证，该用户是否存在以及输入密码是否正确，
     * encode方法进行密码加密，matches进行密码解密与用户输入的密码与数据库存储密码是否一致。
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .passwordEncoder(new BCryptPasswordEncoder())
//                // amdin用户设置的三个角色"xiaohei1","xiaohei2","xiaohei3",如果授权请求中设置了角色，不再当前登陆用户的角色中，则无法访问403
//                .withUser("admin").password(new BCryptPasswordEncoder().encode("123456")).roles("xiaohei1","xiaohei2","xiaohei3")
//                .and()
//                // xiaohei用户设置的角色 role1
//                .withUser("xiaohei").password(new BCryptPasswordEncoder().encode("111111")).roles("role1");
        auth.userDetailsService(userDetailsServiceBean()).passwordEncoder(new PasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                return "1";
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                System.out.println(charSequence+"  "+s);
                return charSequence.equals(s);
            }
        });
    }

    /**
     * 查询数据库用户信息交给security进行用户验证，登陆用户是否存在或密码是否输入真确
     * @return
     */
    @Bean
    @Override
    public UserDetailsService userDetailsServiceBean() {
        return new ZhimiUserDetailsService();
    }
}
