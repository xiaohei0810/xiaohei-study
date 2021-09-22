package com.hand.factoryModel.methodFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/18 10:13 上午
 * @Version 1.0
 */
public class PajialuoFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new Pajialuo();
    }
}
