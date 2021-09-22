package com.hand.factoryModel.abstractFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/18 11:05 上午
 * @Version 1.0
 *  小米手机
 */
public class XiaoMiIphone implements IphoneProduct{
    @Override
    public void open() {
        System.out.println("打开小米手机");
    }

    @Override
    public void play() {
        System.out.println("使用小米手机玩TIMI");
    }

    @Override
    public void call() {
        System.out.println("使用小米手机打电话");
    }
}
