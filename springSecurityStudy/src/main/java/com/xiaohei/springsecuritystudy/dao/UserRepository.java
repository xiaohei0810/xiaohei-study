package com.xiaohei.springsecuritystudy.dao;

import com.xiaohei.springsecuritystudy.entity.UserInfo;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author xin.zhou02@hand-china.com 2019/3/19
 */
public interface UserRepository extends Repository<UserInfo, Integer> {
    /**
     * 根据role_id 查询权限集
     */
    String findAuthorizationByRoleIdSql = "SELECT AUTH_PATH from hmall_fnd_auth_role_mapping r  " +
            "INNER JOIN hmall_fnd_auth_info a  ON r.AUTH_UUID=a.AUTH_UUID WHERE r.ROLE_UUID = ?1";
    /**
     * 根据client_id 查询role_id
     */
    String findRoleIdByClientIdSql = "SELECT o.authorities from oauth_client_details o where client_id= ?1";

    /**
     * 根据name 查询user对象
     *
     * @param name
     * @return
     */
    UserInfo findByNameIsStartingWithAndAgeLessThan(String name,String mobileNumber);


}
