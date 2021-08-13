package com.hand.factory.abstractFactory;

/**
 * @Author xiaohei
 * @Date 2021/5/18 9:43 下午
 * @Version 1.0
 */
public class XiaoMiPhone implements PhoneProduct {
    @Override
    public void call() {
        System.out.println("小米打电话");
    }

    @Override
    public void sendMes() {
        System.out.println("小米发短信啊");
    }
}
