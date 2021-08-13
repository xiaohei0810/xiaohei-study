package com.hand.factory.abstractFactory2;

/**
 * @Author xiaohei
 * @Date 2021/6/24 3:40 下午
 * @Version 1.0
 */
public class ZhimiFactory implements ProductFactory{
    @Override
    public IphoneProduct productPhone() {
        return new ZhimiPhone();
    }

    @Override
    public RouterProduct productRouter() {
        return new ZhimiRouter();
    }
}
