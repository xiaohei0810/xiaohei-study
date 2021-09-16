package com.xiaohei.springsecurityoauth2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/2 5:16 下午
 * @Version 1.0
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfingurer extends ResourceServerConfigurerAdapter {

    // 从配置文件中读取配置
    @Value("${spring.application.name}")
    private String resourceId;

    @Autowired
    private AuthorizationServerTokenServices tokenServices;

    @Autowired
    private TokenStore tokenStore;

    @Autowired
    private CustomAuthenticaationEntryPoint customAuthenticaationEntryPoint;

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Autowired
    private MyRedisTokenStoreConfig myRedisTokenStoreConfig;

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        super.configure(resources);
        resources.resourceId(resourceId)
                .tokenStore(myRedisTokenStoreConfig)
                .stateless(true);
    }

    /**
     * 资源服务器配置真正需要携带token才能访问的请求拦截，当请求/hello和/admin开头的请求时，需要携带token，否则无法访问。
     * @param http
     * @throws Exception
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        //post请求默认的都开启了csrf的模式，所有post请求都必须带有token之类的验证信息才可以进入登陆页面，这边是禁用csrf模式
        http.csrf().disable()
//                .exceptionHandling()
//                .authenticationEntryPoint(customAuthenticaationEntryPoint)
//                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();
    }

//    @Primary
//    @Bean
//    public ResourceServerTokenServices tokenService(){
//        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
//        // 令牌存储策略，这里方便测试使用的是基于内存的存储方式
//        defaultTokenServices.setTokenStore(tokenStore);
//        // 客户端信息服务，这里自定义客户端信息查询实现类，基于数据库查询认证客户端信息
//        defaultTokenServices.setClientDetailsService(oauthClientDetailsService);
//        //是否产生刷新令牌
//        defaultTokenServices.setSupportRefreshToken(true);
//        defaultTokenServices.setReuseRefreshToken(false);
//
//        return defaultTokenServices;
//    }

}
