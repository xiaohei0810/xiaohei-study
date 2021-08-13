package com.hand.factory.abstractFactory;

/**
 * @Author xiaohei
 * @Date 2021/5/18 9:48 下午
 * @Version 1.0
 */
public class HuaWeiPhone implements PhoneProduct{
    @Override
    public void call() {
        System.out.println("华为打电话");
    }

    @Override
    public void sendMes() {
        System.out.println("华为发短信");
    }
}
