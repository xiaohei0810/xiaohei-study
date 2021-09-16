package com.xiaohei.springsecurityoauth2.config;

import com.xiaohei.springsecurityoauth2.dao.OauthClientDetailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/31 6:14 下午
 * @Version 1.0
 */
@Component
@Slf4j
public class OauthClientDetailsService implements ClientDetailsService {

    /**
     * 不一定要通过jpa的方式，可以使用mybatis-plus查询
     */
    @Autowired
    private OauthClientDetailsRepository oauthClientDetailsRepository;

    /**
     * 通过jpa的方式通过clientId查询客户端信息
     * 1、获取授权码时，先验证客户端信息是否有权限访问，既数据库是否存在该客户端信息。
     * 2、用户名和密码验证通过后再次调用该方法查询客户端信息，之后弹出授权页面，是否给予授权，点击授权后，重定向到redirect_uri的地址，后面会拼接返回的code授权码信息来去获取token
     * code=3RdcxZ
     * 3、postman调用接口获取token
     * @param clientId
     * @return
     * @throws ClientRegistrationException
     */
    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {

        BaseClientDetails bs = new BaseClientDetails();

        // 数据库存储的客户端信息
        com.xiaohei.springsecurityoauth2.entity.ClientDetails clientInfo = oauthClientDetailsRepository.findByClientId(clientId);

        if (clientInfo == null) {
            log.error("--------------client id[" + clientId + "] 认证失败");
            throw new RuntimeException("client id 认证失败");
        }

        //authorization  权限
        String roleId = clientInfo.getAuthorities();
//        if (StringUtils.hasText(roleId)) {
//            String[] roles = roleId.split(",");
//            Set<String> authorizationSet = new HashSet<>();
//            for (int i = 0; i < roles.length; i++) {
//                authorizationSet.addAll(userRepository.findAuthorizationByRoleId(Integer.parseInt(roles[i])));
//            }
//            if (!authorizationSet.isEmpty()) {
//                List<GrantedAuthority> authorityList = AuthorityUtils.createAuthorityList(authorizationSet.toArray(new String[0]));
//                bs.setAuthorities(authorityList);
//            }
//        }


        // 客户端id
        bs.setClientId(clientId);
//        String encode = passwordEncoder().encode(clientInfo.getClientSecret());
//        String encode1 = passwordEncoder().encode(clientInfo.getClientSecret());
        // 客户端密钥
        // 如果这里不加加密，则无法获取token
        bs.setClientSecret(clientInfo.getClientSecret());
        //有效时间  默认43200 12小时
        if (clientInfo.getAccessTokenValidity() != null) {
            bs.setAccessTokenValiditySeconds(clientInfo.getAccessTokenValidity().intValue());
        } else {
            bs.setAccessTokenValiditySeconds(43200);
        }

        if (clientInfo.getRefreshTokenValidity() != null) {
            bs.setRefreshTokenValiditySeconds(clientInfo.getRefreshTokenValidity().intValue());
        } else {
            bs.setRefreshTokenValiditySeconds(43200);
        }


        //redirect 授权通过回调地址
        if (StringUtils.hasText(clientInfo.getWebServerRedirectUri())) {
            bs.setRegisteredRedirectUri(StringUtils.commaDelimitedListToSet(clientInfo.getWebServerRedirectUri()));
        }

        //resourceIds 资源服务器的id，访问哪些资源
//        if (StringUtils.hasText(clientInfo.getResourceIds()) && "ALL".equals(clientInfo.getResourceIds().toUpperCase())) {
//            Set<String> scopeList = StringUtils.commaDelimitedListToSet(clientInfo.getResourceIds());
//            if (!scopeList.isEmpty()) {
//                bs.setResourceIds(scopeList);
//            }
//        }
        bs.setResourceIds(Arrays.asList("xiaohei-oauth2"));

        //scope 有哪些操作的权限
        if (StringUtils.hasText(clientInfo.getScope())) {
            Set<String> scopeList = StringUtils.commaDelimitedListToSet(clientInfo.getScope());
            if (!scopeList.isEmpty()) {
                bs.setScope(scopeList);
            }
        }

        // grantTypes 授权类型 四种
        if (StringUtils.hasText(clientInfo.getAuthorizedGrantTypes())) {
            bs.setAuthorizedGrantTypes(StringUtils.commaDelimitedListToSet(clientInfo.getAuthorizedGrantTypes()));
        } else {
            bs.setAuthorizedGrantTypes(new HashSet(Arrays.asList("authorization_code", "refresh_token")));
        }

        return bs;
    }

//    public PasswordEncoder passwordEncoder(){
//        return new MessageDigestPasswordEncoder("SHA-1");
//    }

//    public PasswordEncoder passwordEncoder(){
//        return new MessageDigestPasswordEncoder("SHA-1");
//    }
}
