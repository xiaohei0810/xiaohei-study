package com.hand.factoryModel.simpleFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/17 6:45 下午
 * @Version 1.0
 * 小米汽车
 */
public class Xiaomi implements Car{
    @Override
    public void carName() {
        System.out.println("小米汽车 xiaomi");
    }
}
