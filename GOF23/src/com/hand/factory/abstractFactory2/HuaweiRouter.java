package com.hand.factory.abstractFactory2;

/**
 * @Author xiaohei
 * @Date 2021/6/24 3:37 下午
 * @Version 1.0
 */
public class HuaweiRouter implements RouterProduct{
    @Override
    public void sendWifi() {
        System.out.println("使用华为产品散发wifi");
    }
}
