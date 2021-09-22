package com.hand.factoryModel.simpleFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/17 6:49 下午
 * @Version 1.0
 */
public class Consumer {
    public static void main(String[] args) {
        Car bmw = CarFactory.getCar("BMW");
        Car xiaomi = CarFactory.getCar("XIAOMI");
        bmw.carName();
        xiaomi.carName();
    }
}
