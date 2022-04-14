package com.hand.adapter;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/29 10:45 上午
 * @Version 1.0
 * @Describtion 设计模式之-适配器模式： 两个不想干的接口之间调用，但是具体调用的接口需要目标接口的参数
 */
public interface LogFactory {

    /**
     * 确定目标接口
     * @param s1
     * @param message
     */
    public void debug(String s1,String message);

}
