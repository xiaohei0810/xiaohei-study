//package com.xiaohei.springsecuritystudy.service;
//
//import com.xiaohei.springsecuritystudy.dao.UserRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
///**
// * @Author liangyusheng@xiaomi.com
// * @Date 2021/8/30 5:39 下午
// * @Version 1.0
// */
//@Slf4j
//public class UserInfoService implements UserDetailsService {
//
//

import org.springframework.beans.factory.annotation.Autowired;

//@Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        logger.info("用户名：" + username);
////        UserInfo firstByName = userRepository.findFirstByNameOrMobileNumber(username,username);
////        if (firstByName == null) {
////            throw new RuntimeException("username is " + username + "-------认证错误");
////        }
////
////        Collection<GrantedAuthority> authorities = new ArrayList();
////        authorities.add(new SimpleGrantedAuthority("ALL"));
//
//        return new User(username, null,null);
//    }
//
//}
