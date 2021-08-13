package com.hand.factory.methodFactory;

/**
 * @Author xiaohei
 * @Date 2021/5/17 10:31 下午
 * @Version 1.0
 */
public class BmwFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Bmw();
    }
}
