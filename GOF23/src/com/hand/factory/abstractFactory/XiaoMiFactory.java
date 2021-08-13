package com.hand.factory.abstractFactory;

/**
 * @Author xiaohei
 * @Date 2021/5/18 9:57 下午
 * @Version 1.0
 */
public class XiaoMiFactory implements ProductFactory{
    @Override
    public PhoneProduct productPhoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public RouterProduct productRouterProduct() {
        return new XiaoMiRouter();
    }
}
