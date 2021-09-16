package com.xiaohei.springsecuritystudy.service;

import com.xiaohei.springsecuritystudy.dao.UserRepository;
import com.xiaohei.springsecuritystudy.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 自定义userDetailsService向数据库查询账户密码交给security做权限验证
 *
 * @author zhoulingyu
 * date:2019/2/18
 */

public class ZhimiUserDetailsService implements UserDetailsService {
    private Logger logger = LoggerFactory.getLogger(ZhimiUserDetailsService.class);

//    @Autowired
//    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("用户名：" + username);
//        UserInfo firstByName = userRepository.findFirstByNameOrMobileNumber(username,username);
        UserInfo userInfo = new UserInfo();
        userInfo.setName("xiaohei");
        userInfo.setPassword("12312412");
        if (userInfo == null) {
            throw new RuntimeException("username is " + username + "-------认证错误");
        }

        Collection<GrantedAuthority> authorities = new ArrayList();
        authorities.add(new SimpleGrantedAuthority("ALL"));

        return new User(username, userInfo.getPassword(), authorities);
    }

    /**
     * 加载权限
     *
     * @param clientId
     * @return
     */
//    public Collection<? extends GrantedAuthority> getAuthorities(String clientId) {
//        Collection<? extends GrantedAuthority> authorities = null;
//        String roleId = userRepository.findRoleIdByClientId(clientId);
//        if (!StringUtils.hasText(roleId)) {
//            return null;
//        }
//        Set<String> authorizationSet = new HashSet<>();
//        String[] roles = roleId.split(",");
//        for (int i = 0; i < roles.length; i++) {
//            authorizationSet.addAll(userRepository.findAuthorizationByRoleId(Integer.parseInt(roles[i])));
//        }
//
//        if (!authorizationSet.isEmpty()) {
//            authorities = AuthorityUtils.createAuthorityList(authorizationSet.toArray(new String[0]));
//        }
//        return authorities;
//    }
}
