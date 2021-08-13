package com.hand.factory.abstractFactory;

/**
 * @Author xiaohei
 * @Date 2021/5/18 9:47 下午
 * @Version 1.0
 */
public class XiaoMiRouter implements RouterProduct{
    @Override
    public void openWifi() {
        System.out.println("小米打开wifi");
    }
}
