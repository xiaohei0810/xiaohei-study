package com.hand.factory.abstractFactory2;

/**
 * @Author xiaohei
 * @Date 2021/6/24 3:35 下午
 * @Version 1.0
 */
public class HuaweiPhone implements IphoneProduct{
    @Override
    public void call() {
        System.out.println("华为mateP40");
    }

    @Override
    public void sendMes() {
        System.out.println("使用华为mateP40发短信");

    }

    @Override
    public void weChat() {
        System.out.println("使用华为mateP40聊天");

    }
}
