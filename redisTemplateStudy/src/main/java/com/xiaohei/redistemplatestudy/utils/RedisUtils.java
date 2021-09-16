package com.xiaohei.redistemplatestudy.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/26 3:04 下午
 * @Version 1.0
 */
@Component
public final class RedisUtils {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    /**
     * 设置过期时间
     * @param key
     * @param time
     * @return
     */
    public boolean expire(String key,long time){
        try {
            if (time>0){
                redisTemplate.expire(key,time, TimeUnit.SECONDS);
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }

}
