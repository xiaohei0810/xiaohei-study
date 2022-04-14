package com.xiaohei.springsecurity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootTest
class SpringSecurityApplicationTests {

    @Test
    void contextLoads() {

        // 加密后的密码
        String hashpw = BCrypt.hashpw("123", BCrypt.gensalt());
        System.out.println(hashpw);
        boolean checkpw = BCrypt.checkpw("123", "$2a$10$598CwOsN.Vw8KlaffTc6VuwBILFC7/MieVxTyIwQh5jQRmDAFZw4i");
        System.out.println(checkpw);
    }



}
