package com.xiaohei.springsecurityoauth2.dao;

import com.xiaohei.springsecurityoauth2.entity.ClientDetails;
import org.springframework.data.repository.Repository;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/31 6:16 下午
 * @Version 1.0
 */
public interface OauthClientDetailsRepository extends Repository<ClientDetails,String> {

    ClientDetails findByClientId(String clientId);

}
