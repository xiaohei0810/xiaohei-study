package com.hand.factory.abstractFactory;

/**
 * @Author xiaohei
 * @Date 2021/5/18 9:49 下午
 * @Version 1.0
 */
public class HuaWeiRouter implements RouterProduct{
    @Override
    public void openWifi() {
        System.out.println("华为路由器打开。");
    }
}
