package com.xiaohei.springsecurityoauth2.controller;

import com.xiaohei.springsecurityoauth2.dao.UserInfoReposirity;
import com.xiaohei.springsecurityoauth2.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/31 4:48 下午
 * @Version 1.0
 */
@RestController
@RequestMapping("/xiaohei")
public class SpringSecurityOauth2RepositoryController {

    @Autowired
    private UserInfoReposirity userInfoReposirity;

    @RequestMapping("/test/reposirity")
    public UserInfo testReposirity(){
        UserInfo result = userInfoReposirity.findByUsernameIs("xiaohei");
        return result;
    }


//    @RequestMapping("/oauth/{id}")
//    public String ouathTest(@PathVariable("id") String id){
////        UserInfo result = userInfoReposirity.findByNameIs("xiaohei");
//        return "security study "+id;
//    }

    /**
     * 需要携带token认证才能访问
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    /**
     * 需要携带token认证才能访问
     * @return
     */
    @GetMapping("/admin/hello")
    public String admin() {
        return "hello admin";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "hello user";
    }

}
