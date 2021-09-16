package com.xiaohei.springsecurityoauth2.config;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import org.springframework.security.oauth2.common.DefaultOAuth2RefreshToken;

import java.lang.reflect.Type;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/6 11:33 上午
 * @Version 1.0
 * 自定义默认的刷新token序列化工具类
 */
public class DefaultOauth2RefreshTokenSerializer implements ObjectDeserializer {
    @Override
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object o) {

        if (type == DefaultOAuth2RefreshToken.class) {
            JSONObject jsonObject = defaultJSONParser.parseObject();
            String tokenId = jsonObject.getString("value");
            DefaultOAuth2RefreshToken refreshToken = new DefaultOAuth2RefreshToken(tokenId);
            return (T) refreshToken;
        }

        return null;
    }

    @Override
    public int getFastMatchToken() {
        return 0;
    }
}
