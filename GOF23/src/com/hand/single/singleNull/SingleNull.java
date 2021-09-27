package com.hand.single.singleNull;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/23 10:27 上午
 * @Version 1.0
 * 懒汉式单例，其不是线程安全的，也就是说在多线程环境下，系统中有可能存在多个实例。除此之外，通过反射也可以创建新的实例。
 */
public class SingleNull {

    private static SingleNull singleNull;

    private SingleNull(){

    }

    public static SingleNull getInstance(){
        if (singleNull == null){
            singleNull =  new SingleNull();
        }
        return singleNull;
    }

}
