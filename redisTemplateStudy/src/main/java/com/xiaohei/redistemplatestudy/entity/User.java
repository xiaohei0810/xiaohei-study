package com.xiaohei.redistemplatestudy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/26 10:42 上午
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {

    private String name;

    private int age;

}
