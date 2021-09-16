package com.xiaohei.springsecurityoauth2.config;

import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;
import com.xiaohei.springsecurityoauth2.entity.UserInfo;
import org.springframework.security.oauth2.common.DefaultExpiringOAuth2RefreshToken;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.DefaultOAuth2RefreshToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStoreSerializationStrategy;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/6 11:21 上午
 * @Version 1.0
 * fastjson redis存储json格式序列化反序列化工具类
 */
public class FastjsonRedisTokenStoreSerializationStrategy implements RedisTokenStoreSerializationStrategy {

    private static ParserConfig config = new ParserConfig();

    static {
        init();
    }

    protected static void init() {
        //自定义oauth2序列化：DefaultOAuth2RefreshToken 没有setValue方法，会导致JSON序列化为null
        config.setAutoTypeSupport(true);//开启AutoType
        //自定义DefaultOauth2RefreshTokenSerializer反序列化
        config.putDeserializer(DefaultOAuth2RefreshToken.class, new DefaultOauth2RefreshTokenSerializer());
        //自定义OAuth2Authentication反序列化
        config.putDeserializer(OAuth2Authentication.class, new OAuth2AuthenticationSerializer());
        //添加autotype白名单
        config.addAccept("org.springframework.security.oauth2.provider.");
        config.addAccept("org.springframework.security.oauth2.provider.client");
        TypeUtils.addMapping("org.springframework.security.oauth2.provider.OAuth2Authentication",
                OAuth2Authentication.class);
        TypeUtils.addMapping("org.springframework.security.oauth2.provider.client.BaseClientDetails",
                BaseClientDetails.class);

        config.addAccept("org.springframework.security.oauth2.common.");
        TypeUtils.addMapping("org.springframework.security.oauth2.common.DefaultOAuth2AccessToken", DefaultOAuth2AccessToken.class);
        TypeUtils.addMapping("org.springframework.security.oauth2.common.DefaultExpiringOAuth2RefreshToken", DefaultExpiringOAuth2RefreshToken.class);

        config.addAccept("com.xiaohei.springsecurityoauth2.entity");
        TypeUtils.addMapping("com.xiaohei.springsecurityoauth2.entity.UserInfo", UserInfo.class);

        config.addAccept("org.springframework.security.web.authentication.preauth");
        TypeUtils.addMapping("org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken", PreAuthenticatedAuthenticationToken.class);
    }


    @Override
    public <T> T deserialize(byte[] bytes, Class<T> clazz) {
        return null;
    }

    @Override
    public String deserializeString(byte[] bytes) {
        return null;
    }

    @Override
    public byte[] serialize(Object object) {
        return new byte[0];
    }

    @Override
    public byte[] serialize(String data) {
        return new byte[0];
    }
}
