package com.hand.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 11:06 上午
 * @Version 1.0
 * @Describtion 动态代理类，实现InvocationHandler接口
 */
public class DynamicProxy implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private Object target;

    /**
     * 构造方法，给我们要代理的真实对象赋初值
     * @param target
     */
    public DynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 当代理对象调用方法时，会根据通过Proxy代理类生成代理类的InvocationHandler对象位置执行invoke方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 自定义方法，可以理解前置通知，在代理真实对象前我们可以添加一些自己的操作
        System.out.println("执行的方法为:"+method.getName());
        System.out.println("Method:"+method);
        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
