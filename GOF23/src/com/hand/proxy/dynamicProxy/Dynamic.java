package com.hand.proxy.dynamicProxy;

import com.hand.proxy.staticProxy.ProxyInterface;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 11:04 上午
 * @Version 1.0
 * @Describtion 被动态代理类
 */
public class Dynamic implements ProxyInterface {
    @Override
    public void submit(String message) {
        System.out.println("这是动态代理:"+message);
    }

    @Override
    public void defiend() {
        System.out.println("测试动态代理");
    }
}
