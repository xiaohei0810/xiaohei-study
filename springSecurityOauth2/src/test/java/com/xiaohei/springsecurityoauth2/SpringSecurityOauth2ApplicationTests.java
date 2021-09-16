package com.xiaohei.springsecurityoauth2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringSecurityOauth2ApplicationTests {

    @Test
    void contextLoads() {
        BCryptPasswordEncoder bcryptEncoder = new BCryptPasswordEncoder();

        System.out.println(bcryptEncoder.encode("123456"));

    }

}
