package com.hand.factory.simpleFactory;



/**
 * @Author xiaohei
 * @Date 2021/5/17 10:37 下午
 * @Version 1.0
 */
public class CarFactory{
    public static Car getAodi(){
        return new Aodi();
    }

    public static Car getTsila(){
        return new Tsila();
    }
}
