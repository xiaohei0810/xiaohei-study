package com.hand.proxy.staticProxy;

import com.hand.proxy.dynamicProxy.Dynamic;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 10:36 上午
 * @Version 1.0
 * @Describtion
 */
public class Test {
    public static void main(String[] args) {
//        ProxyInterface proxy = ProxyFactory.getProxy();
//        proxy.submit("这是代理对象调用的被代理对象的submit方法");
//        proxy.defiend();


        // 要代理的真实对象
        Dynamic dynamic = new Dynamic();
        ProxyInterface dynamicProxy = (ProxyInterface)ProxyFactory.getDynamicProxy(dynamic);
        // 动态代理对象调用被代理对象方法时，会自动执行到创建代理对象时关联的InvocationHandler的invoke方法
        dynamicProxy.submit("动态代理");
        System.out.println("测试方法执行顺序");
        System.out.println(dynamicProxy.getClass().getName());
        dynamicProxy.defiend();
    }
}
