package com.hand.factory.abstractFactory2;

/**
 * @Author xiaohei
 * @Date 2021/6/24 3:39 下午
 * @Version 1.0
 */
public interface ProductFactory {

    // 产品工厂，生产产品-手机还有路由器
    IphoneProduct productPhone();

    // 生产路由器
    RouterProduct productRouter();
}
