package com.xiaohei.springsecurityoauth2.dao;

import com.xiaohei.springsecurityoauth2.entity.UserInfo;
import org.springframework.data.repository.Repository;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/31 4:44 下午
 * @Version 1.0
 * 标准接口，通过指定格式命名可以不用写sql直接实现简单查询，继承Repository则该接口交给spring IOC管理，直接注入使用。
 */
public interface UserInfoReposirity extends Repository<UserInfo,Integer> {

    /**
     * 命名一定要按照指定格式命名，否则不生效，通过名字查询信息
     * @param name
     * @return
     */
    public UserInfo findByUsernameIs(String name);

}
