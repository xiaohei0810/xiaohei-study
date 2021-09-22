package com.hand.factoryModel.abstractFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/18 11:15 上午
 * @Version 1.0
 */
public class MacFactory implements ProductFactory{
    @Override
    public IphoneProduct productIphone() {
        return new MacIphone();
    }

    @Override
    public ComputerProduct productComputer() {
        return new MacComputer();
    }
}
