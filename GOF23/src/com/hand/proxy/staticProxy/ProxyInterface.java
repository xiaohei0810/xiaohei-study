package com.hand.proxy.staticProxy;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 10:10 上午
 * @Version 1.0
 * @Describtion 静态代理，创建规范接口，提供公共方法
 */
public interface ProxyInterface {

    /**
     * 定义一个提交方法
     * @param message
     */
    void submit(String message);

    /**
     * 普通方法
     */
    void defiend();

}
