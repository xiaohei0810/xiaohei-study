package com.hand.factoryModel.abstractFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/18 11:14 上午
 * @Version 1.0
 */
public class XiaoMiFactory implements ProductFactory{
    @Override
    public IphoneProduct productIphone() {
        return new XiaoMiIphone();
    }

    @Override
    public ComputerProduct productComputer() {
        return new XiaoMIComputer();
    }
}
