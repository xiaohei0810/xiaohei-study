package com.hand.factoryModel.abstractFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/18 10:59 上午
 * @Version 1.0
 * 手机生产接口
 */
public interface IphoneProduct {

    /**
     * 开机
     */
    void open();

    /**
     * 玩游戏
     */
    void play();

    /**
     *打电话
     */
    void call();

}
