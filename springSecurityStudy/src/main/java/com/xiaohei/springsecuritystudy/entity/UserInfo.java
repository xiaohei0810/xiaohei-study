package com.xiaohei.springsecuritystudy.entity;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/30 5:32 下午
 * @Version 1.0
 */
@Entity
@Table(name = "user_info")
@Data
public class UserInfo implements Serializable {

    /**
     */
    private static final long serialVersionUID = 1L;
    @Id
    private Integer uuid;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String name;

}
