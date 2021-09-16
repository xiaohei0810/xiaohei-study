package com.xiaohei.springsecurityoauth2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/31 5:45 下午
 * @Version 1.0
 * 授权配置服务器，用来发放授权码以及验证客户端信息
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfigurer extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private OauthClientDetailsService oauthClientDetailsService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Autowired
    private TokenStore tokenStore;

    @Autowired
    private MyRedisTokenStore myRedisTokenStore;

    @Autowired
    private MyRedisTokenStoreConfig myRedisTokenStoreConfig;

    @Autowired
    private org.springframework.security.core.userdetails.UserDetailsService userDetailsService;

    public AuthorizationServerConfigurer() {
        super();
    }

    /**
     *     检测token的策略
     *     令牌端点的安全约束，配置了令牌端点，限制哪些用户可以访问申请令牌url
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.allowFormAuthenticationForClients()    // 允许form表单客户端认证,允许客户端使用client_id和client_secret获取token
                .checkTokenAccess("permitAll()");       //通过验证返回token信息,不拦截
    }

    /**
     *     指定客户端登录信息来源，配置客户端信息服务，支持哪些客户端访问
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(oauthClientDetailsService);
    }

    /**
     * 授权服务需要发发送令牌，配置令牌访问端点和令牌怎么发放（令牌服务token server），配置令牌访问端点:(可以理解为申请令牌的url)
     * 令牌管理服务 token service 管理令牌怎么存储和发放
     * 令牌认证服务 AuthenticationManager
     * @param endpoints
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        super.configure(endpoints);
        // 配置认证管理器，密码授权类型必须配置
        endpoints.authenticationManager(authenticationManager);
        // 配置令牌服务，一定要配置，否则即使请求带有token也显示token无效无法访问。这里是拿到token去token服务里面校验是否存在这个token
        endpoints.tokenServices(tokenServices());
        // 配合密码认证一起使用
//        endpoints.userDetailsService(userDetailsService);
//        endpoints.authorizationCodeServices(authorizationCodeServices());
//        endpoints.authorizationCodeServices();

        endpoints.allowedTokenEndpointRequestMethods(HttpMethod.GET,HttpMethod.POST);
    }

    /**
     * 令牌服务
     * 个人理解用来存储token和校验token的工具
     * @return
     */
    /**
     * <p>注意，自定义TokenServices的时候，需要设置@Primary，否则报错，</p>
     * @return
     */
    @Primary
    @Bean
    public AuthorizationServerTokenServices tokenServices(){
//        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
//        defaultTokenServices.setClientDetailsService(oauthClientDetailsService);
//        defaultTokenServices.setSupportRefreshToken(true);
//        defaultTokenServices.setReuseRefreshToken(false);
//        defaultTokenServices.setTokenStore(myRedisTokenStore);
//        return defaultTokenServices;

        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
        // 令牌存储策略，这里方便测试使用的是基于内存的存储方式
        defaultTokenServices.setTokenStore(myRedisTokenStoreConfig);
        // 客户端信息服务，这里自定义客户端信息查询实现类，基于数据库查询认证客户端信息
        defaultTokenServices.setClientDetailsService(oauthClientDetailsService);
        //是否产生刷新令牌
        defaultTokenServices.setSupportRefreshToken(true);
        defaultTokenServices.setReuseRefreshToken(false);

        return defaultTokenServices;
    }

    //授权码模式专用对象
//    @Bean
//    public AuthorizationCodeServices authorizationCodeServices() {
//        return new InMemoryAuthorizationCodeServices();
//    }
}
