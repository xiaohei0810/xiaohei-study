package com.hand.prototype;


import java.util.Date;

/**
 * @Author xiaohei
 * @Date 2021/6/25 11:36 上午
 * @Version 1.0
 */
// 原型模式
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date();

        //创建对象  
        Computer c1 = new Computer("彗星cpu", "雷蛇键盘", date);
        Computer c2 = (Computer)c1.clone();

        // 设置日期钱
        System.out.println("开始的对象"+c1);
        System.out.println("通过原型模式复制出来的对象"+c2);

        System.out.println("分割线==========================分割线");
        c1.setDateTime(new Date(111111));
//        Computer c3 = (Computer)c1.clone();

//        Computer c3 = (Computer)c1.clone();
        // 设置日期钱
        System.out.println("开始的对象"+c1);
        System.out.println("通过原型模式复制出来的对象"+c2);
    }
}
