package com.example.springboottest.service;

import com.example.springboottest.dao.UserInfo;
import org.springframework.data.repository.Repository;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/31 4:26 下午
 * @Version 1.0
 */
public interface UserReposirity extends Repository<UserInfo,Integer> {

    public UserInfo findByNameIs(String name);

}
