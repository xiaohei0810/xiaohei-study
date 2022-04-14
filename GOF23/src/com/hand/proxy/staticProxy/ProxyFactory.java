package com.hand.proxy.staticProxy;

import com.hand.proxy.dynamicProxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 10:34 上午
 * @Version 1.0
 * @Describtion 代理工厂，获取代理类
 */
public class ProxyFactory {

    /**
     * 获取静态代理类
     * @return
     */
    public static ProxyInterface getProxy(){
        return new Represented(new Berepresented());
    }


    /**
     * 获取动态代理类
     * @return
     */
    public static Object getDynamicProxy(Object target){
        //handler:这个参数指的是，动态代理对象调用真实对象的方法时，会关联到哪个InvocationHandler的对象上面。
        //每一个动态代理类都必须要实现InvocationHandler这个接口，并且每个代理类的实例都关联到了一个handler（通过Proxy代理创建代理对象时，要传入InvocationHandler的实例）。
        //当我们通过代理对象调用一个方法的时候，这个方法的调用就会被转发为由InvocationHandler这个接口的 invoke 方法来进行调用，执行到这里。

        // 我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的，真实对象target
        InvocationHandler handler = new DynamicProxy(target);
        /*
         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
         * 第一个参数 handler.getClass().getClassLoader() ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象，这里使用的是target真实对象的ClassLoader
         * 第二个参数target.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
         * 第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上，即DynamicProxy
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),handler);
    }

}
