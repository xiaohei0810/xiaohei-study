package com.hand.factory.abstractFactory2;

/**
 * @Author xiaohei
 * @Date 2021/6/24 3:33 下午
 * @Version 1.0
 */
public class ZhimiPhone implements IphoneProduct{
    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void sendMes() {
        System.out.println("发短信");

    }

    @Override
    public void weChat() {
        System.out.println("聊天");

    }
}
