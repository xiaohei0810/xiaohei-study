package com.hand.factory.abstractFactory;

/**
 * @Author xiaohei
 * @Date 2021/5/18 9:50 下午
 * @Version 1.0
 */
public interface ProductFactory {
    /**
     * 生产手机
     * @return
     */
    PhoneProduct productPhoneProduct();

    /**
     * 生产路由器
     */
    RouterProduct productRouterProduct();

}
