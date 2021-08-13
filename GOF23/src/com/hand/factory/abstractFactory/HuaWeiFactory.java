package com.hand.factory.abstractFactory;

/**
 * @Author xiaohei
 * @Date 2021/5/18 9:58 下午
 * @Version 1.0
 */
public class HuaWeiFactory implements ProductFactory{
    @Override
    public PhoneProduct productPhoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public RouterProduct productRouterProduct() {
        return new HuaWeiRouter();
    }
}
