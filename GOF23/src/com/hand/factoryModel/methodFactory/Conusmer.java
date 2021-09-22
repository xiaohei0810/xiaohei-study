package com.hand.factoryModel.methodFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/18 10:14 上午
 * @Version 1.0
 */
public class Conusmer {
    public static void main(String[] args) {
        // 怕伽罗汽车
        Car pajialuo =new PajialuoFactory().getCar();

        // 小鹏汽车
        Car xiaopeng =  new XiaopengFactory().getCar();

        pajialuo.carName();
        xiaopeng.carName();
    }
}
