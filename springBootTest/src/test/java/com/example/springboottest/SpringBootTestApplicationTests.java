package com.example.springboottest;

import com.example.springboottest.dao.UserInfo;
import com.example.springboottest.service.UserReposirity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestApplicationTests {

    @Autowired
    private UserReposirity userReposirity;

    @Test
    void contextLoads() {
        UserInfo nameIs = userReposirity.findByNameIs("xiaohei");
        System.out.println(nameIs);
    }

}
