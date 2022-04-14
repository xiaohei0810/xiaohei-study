package com.hand.proxy.staticProxy;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 10:31 上午
 * @Version 1.0
 * @Describtion 静态代理类，为其他对象进行代理，来实现对被代理类的方法的调用。
 */
public class Represented implements ProxyInterface{

    ProxyInterface proxyInterface;

    public Represented(ProxyInterface proxyInterface) {
        this.proxyInterface = proxyInterface;
    }

    @Override
    public void submit(String message) {
        proxyInterface.submit(message);
    }

    @Override
    public void defiend() {
        proxyInterface.defiend();
    }
}
