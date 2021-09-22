package com.hand.factoryModel.abstractFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/18 11:15 上午
 * @Version 1.0
 */
public class Consumer {
    public static void main(String[] args) {
        // 小米
        IphoneProduct iphoneProduct = new XiaoMiFactory().productIphone();
        ComputerProduct computerProduct = new XiaoMiFactory().productComputer();
        iphoneProduct.call();
        computerProduct.coding();

        //mac
        IphoneProduct product = new MacFactory().productIphone();
        ComputerProduct computer = new MacFactory().productComputer();
        product.call();
        computer.coding();

    }
}
