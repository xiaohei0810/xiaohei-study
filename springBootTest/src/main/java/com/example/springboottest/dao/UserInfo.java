package com.example.springboottest.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/31 4:24 下午
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_info")
public class UserInfo {
    @Id
    private Integer uuid;
    /**
     * 手机号码
     */
    private String password;
    /**
     * 昵称
     */
    private String name;
}
