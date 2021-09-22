package com.hand.factoryModel.abstractFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/18 11:10 上午
 * @Version 1.0
 */
public class MacComputer implements ComputerProduct{
    @Override
    public void coding() {
        System.out.println("使用mac写代码");
    }

    @Override
    public void listen() {
        System.out.println("使用mac听音乐");
    }
}
