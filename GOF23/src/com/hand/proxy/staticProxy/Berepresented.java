package com.hand.proxy.staticProxy;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 10:13 上午
 * @Version 1.0
 * @Describtion 被代理类，需要实现代理接口重写方法
 */
public class Berepresented implements ProxyInterface{


    @Override
    public void submit(String message) {
        System.out.println(String.format("小黑测试静态代理：%s",message));
    }

    @Override
    public void defiend() {
        System.out.println("这是静态代理模式:由代理类执行的被代理累的方法");
    }
}
