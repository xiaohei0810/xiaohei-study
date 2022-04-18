package com.xiaomi.redisstudy.entity;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/27 6:46 下午
 * @Version 1.0
 */
public class Student {

    private  String name;

    private String sex;

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
