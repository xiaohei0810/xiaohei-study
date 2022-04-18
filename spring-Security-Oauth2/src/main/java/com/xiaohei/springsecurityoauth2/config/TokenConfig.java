package com.xiaohei.springsecurityoauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2022/4/14 5:35 下午
 * @Describtion
 */
@Configuration
public class TokenConfig {

    /**
     * 令牌存储策略
     * @return
     */
    @Bean
    public TokenStore tokenStore(){
        // 暂时采用内存方式存储，生成普通令牌，后面换成redis或者jwt方式存储令牌
        return new InMemoryTokenStore();
    }

}
