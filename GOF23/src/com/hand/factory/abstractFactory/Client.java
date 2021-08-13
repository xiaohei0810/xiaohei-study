package com.hand.factory.abstractFactory;

/**
 * @Author xiaohei
 * @Date 2021/5/18 9:55 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        PhoneProduct phoneProduct = xiaoMiFactory.productPhoneProduct();
        phoneProduct.call();

        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        PhoneProduct product = huaWeiFactory.productPhoneProduct();
        product.call();
    }
}
