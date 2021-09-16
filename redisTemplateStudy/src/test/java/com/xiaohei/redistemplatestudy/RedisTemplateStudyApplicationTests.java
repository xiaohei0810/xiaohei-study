package com.xiaohei.redistemplatestudy;

import com.xiaohei.redistemplatestudy.cache.RedisKeyCacheKey;
import com.xiaohei.redistemplatestudy.entity.User;
import com.xiaohei.redistemplatestudy.utils.RedisUtils;
import io.lettuce.core.output.StatusOutput;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.BitFieldSubCommands;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.TimeoutUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;


@SpringBootTest
class RedisTemplateStudyApplicationTests {

    /**
     * 引入自己配置的redisTemplate模版，实现key的string序列化和value的json序列化方式
     */
    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @Test
    void contextLoads() {

        //string
//        try {
//            stringRedis();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        stringRedis();

        //set

//        setRedis();

        //list
//        setList();

        //hash
//        setHash();

        //zset
//        setZset();

        //bitmap
        bitmapRedis();
    }

    /**
     * 字符串类型
     */
    void stringRedis() {
        //设置值
        redisTemplate.opsForValue().set(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s1", "I Love U!");
//        //追加值
//        redisTemplate.opsForValue().append(RedisKeyCacheKey.SMARTMI_KEY_STRING+"s1","append a str");
//        //获取值
//        Object s1 = redisTemplate.opsForValue().get(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s1");
        //减少值，value要为数字
//        try {
//            redisTemplate.opsForValue().decrement(RedisKeyCacheKey.SMARTMI_KEY_STRING+"s1",2);
//        }catch (Exception e){
//            System.out.println("异常发生并捕获");
//        }
        // 测试发生异常时,catch可以执行逻辑返回数据。
        try {
            redisTemplate.opsForValue().decrement(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s1", 2);
        } catch (Exception e) {
            // 这里可以用作其他逻辑处理
            System.out.println("已经发生异常了");
        }

//        redisTemplate.opsForValue().set(RedisKeyCacheKey.SMARTMI_KEY_STRING+"s2",1996);
//        // 增加值
//        Long increment = redisTemplate.opsForValue().increment(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s2", 4);
//
//        //追加值
//        redisTemplate.opsForValue().append(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s2","append 5");
////        redisTemplate.opsForValue().
//        redisTemplate.opsForValue().set(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s3","3");
//        Object str3 = redisTemplate.opsForValue().get(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s3");
//        System.out.println("测试发生异常后程序是否还会继续执行！");
//        System.out.println(increment);
//        System.out.println(str3);
//        //追加
//        redisTemplate.opsForValue().append(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s3","123");
//        Object str = redisTemplate.opsForValue().get(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s3");
//        System.out.println(str);
//
//        stringRedisTemplate.opsForValue().set(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s4","1asfaf");
//        stringRedisTemplate.opsForValue().append(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s4","23231");
//        String s = stringRedisTemplate.opsForValue().get(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s4");
//        System.out.println(s);

        redisTemplate.opsForValue().set(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s5", "asdkjkl");
        // 增加值
//        Long increment = redisTemplate.opsForValue().increment(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s5", 4);

        //追加值append方法存在取值问题
//        redisTemplate.opsForValue().append(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s5","asdf1");
//        String o = (String)redisTemplate.opsForValue().get(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s5");
//        System.out.println(o);

        //现获取原来的值，再设置新的值
        Object original = redisTemplate.opsForValue().getAndSet(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s5", 1998);
        Object now = redisTemplate.opsForValue().get(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s5");

        // 如果原来的值不存在，则返回null，并且设置新的值。
        Object original1 = redisTemplate.opsForValue().getAndSet(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s6", 2000);
        Object now1 = redisTemplate.opsForValue().get(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s5");
        System.out.println(original1 + "====>" + now1);

        // 如果健不存在则新增，如果key存在则不改变
//        Boolean ifAbsent = redisTemplate.opsForValue().setIfAbsent(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s5", "haodadebeijing");
//        Boolean ifAbsent2 = redisTemplate.opsForValue().setIfAbsent(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s7", "s7");
//        System.out.println(ifAbsent+"=>>>>"+ifAbsent2);


//        redisTemplate.opsForValue().set(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s9", "s9",40,TimeUnit.SECONDS );
        redisTemplate.opsForValue().set(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s5", "s5", 40, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s4", "s1", 40, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s1", "s1");

        // 如果健不存在则新增并设置失效时间，如果key存在则不改变,也不会设置失效时间,
        redisTemplate.opsForValue().setIfAbsent(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s1", "s111", 40, TimeUnit.SECONDS);


        User user1 = new User("xiaohei", 26);
        User user2 = new User("jinming", 27);
        User user3 = new User("haonan", 333);
        User user4 = new User("jianxun", 29);
        User user5 = new User("jianxun", 30);
        Map<String, User> map1 = new HashMap<>();
        map1.put(RedisKeyCacheKey.SMARTMI_KEY_STRING + "user1", user1);
        map1.put(RedisKeyCacheKey.SMARTMI_KEY_STRING + "user2", user2);
        map1.put(RedisKeyCacheKey.SMARTMI_KEY_STRING + "user3", user3);
        map1.put(RedisKeyCacheKey.SMARTMI_KEY_STRING + "user4", user4);
        map1.put(RedisKeyCacheKey.SMARTMI_KEY_STRING + "user5", user5);
        //设置map集合,相当于一次存储多个值
//        Object o = redisTemplate.opsForValue().get(RedisKeyCacheKey.SMARTMI_KEY_STRING + "user1");
//        List list = redisTemplate.opsForValue().multiGet((Collection) map);
//        for (Object o : list) {
//            System.out.println(o);
//        }
        redisTemplate.opsForValue().multiSetIfAbsent(map1);
//        System.out.println(o);

        //获取字符串长度
        Long size = redisTemplate.opsForValue().size(RedisKeyCacheKey.SMARTMI_KEY_STRING + "s2");
        System.out.println(size);

    }


    /**
     * set类型
     */
    void setRedis() {
        User user = new User("xiaohei", 23);
        //一次性添加多个值
        redisTemplate.opsForSet().add(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1", 1, "xiaohei", user, 23, 44);
        redisTemplate.opsForSet().add(RedisKeyCacheKey.SMARTMI_KEY_SET + "set2", 1, "xiaohei", user, 11, 333);

        //获取value的数量
        Long size = redisTemplate.opsForSet().size(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1");
        System.out.println("size大小:" + size);

        //获取set中所有的值
        Set members = redisTemplate.opsForSet().members(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1");
        for (Object member : members) {
            System.out.println(member);
        }
        System.out.println(members);

        // 判断集合中是否存在指定值
        Boolean member = redisTemplate.opsForSet().isMember(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1", 24);
        Boolean member1 = redisTemplate.opsForSet().isMember(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1", 23);
        System.out.println(member + "=>>>>" + member1);
        System.out.println("===============================");

        //以第一个集合为准，与第二个集合做比较有哪些不同的值，并返回。
        Set difference = redisTemplate.opsForSet().difference(RedisKeyCacheKey.SMARTMI_KEY_SET + "set2", RedisKeyCacheKey.SMARTMI_KEY_SET + "set1");
        for (Object o : difference) {
            System.out.println(o);
        }

        System.out.println("===============================");
        // 将第一个key为准，和第二个key做比较，将不同的元素存储到第三个key中
        redisTemplate.opsForSet().differenceAndStore(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1", RedisKeyCacheKey.SMARTMI_KEY_SET + "set2", RedisKeyCacheKey.SMARTMI_KEY_SET + "set3");

        System.out.println("===============================");

        //获取去重的随机元素。
        Set set = redisTemplate.opsForSet().distinctRandomMembers(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1", 3);
        for (Object o : set) {
            System.out.println(o);
        }

        System.out.println("===============================");
        // 求两个集合中元素的交集
        Set intersect = redisTemplate.opsForSet().intersect(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1", RedisKeyCacheKey.SMARTMI_KEY_SET + "set2");
        for (Object s : intersect) {
            System.out.println(s);
        }

        System.out.println("===============================");
        // 求两个key中元素的交集,并放到第三个key中
        redisTemplate.opsForSet().intersectAndStore(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1", RedisKeyCacheKey.SMARTMI_KEY_SET + "set2", RedisKeyCacheKey.SMARTMI_KEY_SET + "set4");

        //从key中取出值，取出后集合元素会发生改变，取出元素后，原来的集合将把该元素去除。
        List pop = redisTemplate.opsForSet().pop(RedisKeyCacheKey.SMARTMI_KEY_SET + "set4", 1);
        for (Object s : pop) {
            System.out.println(s);
        }

        System.out.println("===============================");
        // 将key重的指定元素移除，并放到另一个key中
        Boolean move = redisTemplate.opsForSet().move(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1", 1111, RedisKeyCacheKey.SMARTMI_KEY_SET + "set2");
        System.out.println(move);

        System.out.println("===============================");
        // 求并集
        Set union = redisTemplate.opsForSet().union(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1", RedisKeyCacheKey.SMARTMI_KEY_SET + "set2");
        for (Object o : union) {
            System.out.println(o);
        }
        // 一次移除key中的多个值
        redisTemplate.opsForSet().remove(RedisKeyCacheKey.SMARTMI_KEY_SET + "set1", "1", "xiaohei", 444);
    }

    /**
     * list类型
     */
    void setList() {
        //向key中添加值，并且一直从左边添加。5 4 3 2 1
//        redisTemplate.opsForList().leftPush(RedisKeyCacheKey.SMARTMI_KEY_LIST+"list1",1);
//        redisTemplate.opsForList().leftPush(RedisKeyCacheKey.SMARTMI_KEY_LIST+"list1",2);
//        redisTemplate.opsForList().leftPush(RedisKeyCacheKey.SMARTMI_KEY_LIST+"list1",3);
//        redisTemplate.opsForList().leftPush(RedisKeyCacheKey.SMARTMI_KEY_LIST+"list1",4);
//        redisTemplate.opsForList().leftPush(RedisKeyCacheKey.SMARTMI_KEY_LIST+"list1",5);

        //从左往右的顺序弹出一个元素
//        Object o = redisTemplate.opsForList().leftPop(RedisKeyCacheKey.SMARTMI_KEY_LIST + "list1");
//        System.out.println(o);

        //将key中指定位置的元素替换成新的元素，超出数组长度就报错
//        redisTemplate.opsForList().set(RedisKeyCacheKey.SMARTMI_KEY_LIST+"list1",7,"add");

        //把最后一个参数值放到指定集合的第一个出现中间参数的前面，如果中间参数值存在的话。
//        redisTemplate.opsForList().leftPush(RedisKeyCacheKey.SMARTMI_KEY_LIST+"list1",2,"niude");

        //获取key中元素数量
//        Long size = redisTemplate.opsForList().size(RedisKeyCacheKey.SMARTMI_KEY_LIST + "list1");
//        System.out.println(size);

        //如果count大于0，从左开始移除count个指定的value值。如果count>0,则从右开始移除count个指定的value
//        redisTemplate.opsForList().remove(RedisKeyCacheKey.SMARTMI_KEY_LIST + "list1",1,3);

        //从左往右的顺序获取集合中指定的元素
//        Object index = redisTemplate.opsForList().index(RedisKeyCacheKey.SMARTMI_KEY_LIST + "list1", 0);
//        System.out.println(index);

        //获取key中指定元素第一次出现的位置,从前往后
//        Long aLong = redisTemplate.opsForList().indexOf(RedisKeyCacheKey.SMARTMI_KEY_LIST + "list1", 1);
//        System.out.println(aLong);

        //获取key中指定元素第一次出现的位置,从后往前
//        Long aLong = redisTemplate.opsForList().lastIndexOf(RedisKeyCacheKey.SMARTMI_KEY_LIST + "list1", 3);
//        System.out.println(aLong);

        //一次性往key中存放多个元素
//        redisTemplate.opsForList().leftPushAll(RedisKeyCacheKey.SMARTMI_KEY_LIST + "list2",123,123,124,555,"asfasf");

        //从左边开始弹出元素
//        Object o = redisTemplate.opsForList().leftPop(RedisKeyCacheKey.SMARTMI_KEY_LIST + "list2");
//        System.out.println(o);

        //从右边开始弹出元素
//        Object o = redisTemplate.opsForList().rightPop(RedisKeyCacheKey.SMARTMI_KEY_LIST + "list2");
//        System.out.println(o);

        //获取key中指定位置的元素，不改变原数组
//        List list = redisTemplate.opsForList().range(RedisKeyCacheKey.SMARTMI_KEY_LIST + "list2", 0, 1);
//        for (Object o : list) {
//            System.out.println(o);
//        }


        redisTemplate.opsForList().trim(RedisKeyCacheKey.SMARTMI_KEY_LIST + "list2", 0, 3);

    }

    /**
     * hash
     */
    void setHash() {
        User user = new User("xiaoheiwangzi", 23);
        //增加值
//        redisTemplate.opsForHash().put(RedisKeyCacheKey.SMARTMI_KEY_HASH+"hash1","hash1",123);
//        redisTemplate.opsForHash().put(RedisKeyCacheKey.SMARTMI_KEY_HASH+"hash1","hash2",123);
//        redisTemplate.opsForHash().put(RedisKeyCacheKey.SMARTMI_KEY_HASH+"hash1","hash3",user);
//
//        Map<String, Object> hashMap = new HashMap<>();
//        hashMap.put("myhash1","test");
//        hashMap.put("myhash2",100);
//        hashMap.put("myhash3",System.currentTimeMillis());
//
//        redisTemplate.opsForHash().putAll(RedisKeyCacheKey.SMARTMI_KEY_HASH+"hash2",hashMap);
//
//        redisTemplate.opsForHash().put(RedisKeyCacheKey.SMARTMI_KEY_HASH+"hash3","integer1",1);
//        redisTemplate.opsForHash().increment(RedisKeyCacheKey.SMARTMI_KEY_HASH+"hash3","integer1",99);

//        Object myhash2 = redisTemplate.opsForHash().get(RedisKeyCacheKey.SMARTMI_KEY_HASH + "hash2", "myhash2");
//        System.out.println(myhash2);

        //删除指定key中的指定多个value
//        Long delete = redisTemplate.opsForHash().delete(RedisKeyCacheKey.SMARTMI_KEY_HASH + "hash1", "hash1", "hash2");
//        System.out.println(delete);

        //获取key中所有的map
//        Map entries = redisTemplate.opsForHash().entries(RedisKeyCacheKey.SMARTMI_KEY_HASH + "hash2");
//        System.out.println(entries);

//        Boolean hash2 = redisTemplate.opsForHash().hasKey(RedisKeyCacheKey.SMARTMI_KEY_HASH + "hash1", "hash3");
//        Boolean hash3 = redisTemplate.opsForHash().hasKey(RedisKeyCacheKey.SMARTMI_KEY_HASH + "hash1", "hash25");
//        System.out.println(hash2+"=>>>>"+hash3);

//        Set keys = redisTemplate.opsForHash().keys(RedisKeyCacheKey.SMARTMI_KEY_HASH + "hash1");
//        for (Object s : keys) {
//            System.out.println(s);
//        }

//        List values = redisTemplate.opsForHash().values(RedisKeyCacheKey.SMARTMI_KEY_HASH + "hash1");
//        for (Object value : values) {
//            System.out.println(value);
//        }

//        Boolean hash1 = redisTemplate.opsForHash().putIfAbsent(RedisKeyCacheKey.SMARTMI_KEY_HASH + "hash1", "hash1", "3333");
//        Boolean hash2 = redisTemplate.opsForHash().putIfAbsent(RedisKeyCacheKey.SMARTMI_KEY_HASH + "hash1","hash66","7777");
//        System.out.println(hash1+"====>"+hash2);

//        redisTemplate.opsForHash
    }

    /**
     * zset
     */
    void setZset() {
        //添加值，并且给每个值设置权重急进行自动排序
//        redisTemplate.opsForZSet().add(RedisKeyCacheKey.SMARTMI_KEY_ZSET+"z1","z1",3);
//        redisTemplate.opsForZSet().add(RedisKeyCacheKey.SMARTMI_KEY_ZSET+"z1","z2",1);
//        redisTemplate.opsForZSet().add(RedisKeyCacheKey.SMARTMI_KEY_ZSET+"z1","z3",2);
//        Set range = redisTemplate.opsForZSet().range(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z1", 0, -1);
//        for (Object o : range) {
//            System.out.println(o);
//        }

//        redisTemplate.opsForZSet().add(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z1", "z1", 2);
//        redisTemplate.opsForZSet().add(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z1", "z4", 3);
//        Set range = redisTemplate.opsForZSet().range(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z1", 0, -1);
//        for (Object o : range) {
//            System.out.println(o);
//        }

        //一次移除多个元素
//        redisTemplate.opsForZSet().remove(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z1","z1","z4");

//        redisTemplate.opsForZSet().add(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z2", "z21", 21);
//        redisTemplate.opsForZSet().add(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z2", "z22", 33);
//        redisTemplate.opsForZSet().add(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z2", "z2", 33);
//
//        // 将两个集合的交集添加到另一个key中
//        redisTemplate.opsForZSet().intersectAndStore(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z1",RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z2",RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z3");
//
//        //如果指定key的value存在，则不处理，如果key指定的value不存在，则新增值
//        redisTemplate.opsForZSet().addIfAbsent(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z2","z21",12);
//        redisTemplate.opsForZSet().addIfAbsent(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z2","z33",333);

        // 获取指定key中在分数范围之间的值
        Long count = redisTemplate.opsForZSet().count(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z2", 21, 333);

        //指定的key的value自增多大的分数
        redisTemplate.opsForZSet().incrementScore(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z2","z2",12);
        System.out.println(count);

        //获取指定key中的元素0 -1表示获取所有元素
        Set range = redisTemplate.opsForZSet().range(RedisKeyCacheKey.SMARTMI_KEY_ZSET + "z2", 1, 2);
        for (Object o : range) {
            System.out.println(o);
        }
    }


    /**
     * 位图
     */
    void bitmapRedis(){
//        redisTemplate.opsForValue().setBit(RedisKeyCacheKey.SMARTMI_KEY_BIT+"bit1",1,true);
//        redisTemplate.opsForValue().setBit(RedisKeyCacheKey.SMARTMI_KEY_BIT+"bit1",2,false);
//        redisTemplate.opsForValue().setBit(RedisKeyCacheKey.SMARTMI_KEY_BIT+"bit1",3,true);
//        redisTemplate.opsForValue().setBit(RedisKeyCacheKey.SMARTMI_KEY_BIT+"bit1",4,true);
//        redisTemplate.opsForValue().setBit(RedisKeyCacheKey.SMARTMI_KEY_BIT+"bit1",5,false);

        Boolean bit = redisTemplate.opsForValue().getBit(RedisKeyCacheKey.SMARTMI_KEY_BIT + "bit1", 2);
//        Boolean bit = redisTemplate.opsForValue().bitField(RedisKeyCacheKey.SMARTMI_KEY_BIT + "bit1", 、.);
        System.out.println(bit);
        System.out.println(bit);
    }
}
