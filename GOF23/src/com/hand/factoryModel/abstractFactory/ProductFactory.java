package com.hand.factoryModel.abstractFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/18 11:11 上午
 * @Version 1.0
 * 生产工厂
 */
public interface ProductFactory {

    /**
     * 生产手机
     * @return
     */
    IphoneProduct productIphone();

    /**
     * 生产电脑
     * @return
     */
    ComputerProduct productComputer();

}
