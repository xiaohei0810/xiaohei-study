package com.hand.factory.abstractFactory2;

import com.hand.factory.abstractFactory.PhoneProduct;
import com.hand.factory.abstractFactory.RouterProduct;
import com.hand.factory.abstractFactory.XiaoMiFactory;

/**
 * @Author xiaohei
 * @Date 2021/6/24 3:41 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        PhoneProduct phoneProduct = xiaoMiFactory.productPhoneProduct();
        phoneProduct.call();
        phoneProduct.sendMes();

        RouterProduct routerProduct = xiaoMiFactory.productRouterProduct();
        routerProduct.openWifi();


        // 生产华为的产品呢
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        // 生产华为的手机，通过工厂创建
        IphoneProduct iphoneProduct = huaweiFactory.productPhone();
        iphoneProduct.call();
        iphoneProduct.sendMes();

        // 生产华为的路由器，通过工厂创建
        com.hand.factory.abstractFactory2.RouterProduct product = huaweiFactory.productRouter();
        product.sendWifi();

    }
}
