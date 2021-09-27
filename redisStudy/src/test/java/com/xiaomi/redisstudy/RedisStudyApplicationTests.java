package com.xiaomi.redisstudy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class RedisStudyApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {

        List newList = new ArrayList();
        newList.add("o");
        newList.add("p");
        newList.add("q");
        redisTemplate.opsForList().leftPushAll("list1111",newList);


        // 如果不用zset存储相同的key "list1111"，只用 redisTemplate.opsForList().leftPushAll是没有问题的，
        // 但是如果key用zset又存储一次int。在获取时就报错。原因还是因为list1111这个key中存储的值类型有不一样的
//        redisTemplate.opsForZSet().add("list1111",1,1);
//        redisTemplate.opsForZSet().add("list1111",2,2);


        List list =  redisTemplate.opsForList().range("list",0,-1);
        System.out.println(list);

    }

}
