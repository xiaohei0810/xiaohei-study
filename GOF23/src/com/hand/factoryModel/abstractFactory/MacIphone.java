package com.hand.factoryModel.abstractFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/18 11:07 上午
 * @Version 1.0
 */
public class MacIphone implements IphoneProduct{
    @Override
    public void open() {
        System.out.println("打开苹果手机");
    }

    @Override
    public void play() {
        System.out.println("玩苹果手机游戏");
    }

    @Override
    public void call() {
        System.out.println("使用苹果手机打电话");
    }
}
