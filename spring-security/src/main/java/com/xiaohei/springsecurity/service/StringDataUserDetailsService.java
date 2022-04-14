package com.xiaohei.springsecurity.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2022/4/14 10:37 上午
 * @Describtion
 */
@Service
public class StringDataUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username====>"+username);
        UserDetails userDetails = User.withUsername("xiaohei").password("$2a$10$598CwOsN.Vw8KlaffTc6VuwBILFC7/MieVxTyIwQh5jQRmDAFZw4i").authorities("p1").build();
        return userDetails;
    }
}
