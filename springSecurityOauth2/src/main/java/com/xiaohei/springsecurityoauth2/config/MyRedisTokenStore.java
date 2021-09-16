package com.xiaohei.springsecurityoauth2.config;

import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.stereotype.Component;

/**
 * @author zhoulingyu
 * 自定义redis存储token
 */

@Component
public class MyRedisTokenStore extends RedisTokenStore {

    public MyRedisTokenStore(RedisConnectionFactory connectionFactory) {
        super(connectionFactory);
    }
}
