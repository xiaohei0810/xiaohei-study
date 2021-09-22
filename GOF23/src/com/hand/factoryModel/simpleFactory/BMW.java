package com.hand.factoryModel.simpleFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/17 6:44 下午
 * @Version 1.0
 * 宝马汽车
 */
public class BMW implements Car{
    @Override
    public void carName() {
        System.out.println("BMW 宝马汽车");
    }
}
