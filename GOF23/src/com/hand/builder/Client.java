package com.hand.builder;

/**
 * @Author xiaohei
 * @Date 2021/6/24 5:29 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        // 建房子
        HouseProduct product = director.product(new BuilderModel());
        System.out.println(product);
    }
}
