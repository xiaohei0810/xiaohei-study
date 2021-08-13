package com.hand.factory.abstractFactory2;

/**
 * @Author xiaohei
 * @Date 2021/6/24 3:41 下午
 * @Version 1.0
 */
public class HuaweiFactory implements ProductFactory{
    @Override
    public IphoneProduct productPhone() {
        return new HuaweiPhone();
    }

    @Override
    public RouterProduct productRouter() {
        return new HuaweiRouter();
    }
}
