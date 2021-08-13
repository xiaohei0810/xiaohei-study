package com.hand.factory.abstractFactory2;

/**
 * @Author xiaohei
 * @Date 2021/6/24 3:36 下午
 * @Version 1.0
 */
public class ZhimiRouter implements RouterProduct{
    @Override
    public void sendWifi() {
        System.out.println("使用智米产品散发wifi");
    }
}
