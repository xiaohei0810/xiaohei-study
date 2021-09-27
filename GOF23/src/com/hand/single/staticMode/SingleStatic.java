package com.hand.single.staticMode;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/23 10:20 上午
 * @Version 1.0
 * 饿汉式单例设计模式
 */
public class SingleStatic {

    /**
     * 1.定义静态全局变量类一加载就初始化对象
     */
    private static SingleStatic single = new SingleStatic();

    /**
     * 2.私有化构造方法，防止外面通过构造方法创建对象
     */
    private SingleStatic(){

    }

    static {
        System.out.println("测试静态代码块类一加载是否被执行");
    }

    /**
     * 3.获取实例
     */
    public static SingleStatic getInstance(){
        return single;
    }

}
