package com.hand.factoryModel.simpleFactory;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/17 6:41 下午
 * @Version 1.0
 * 汽车工厂
 */
public class CarFactory{

    public static Car getCar(String carName){
        if ("BMW".equals(carName)){
            return new BMW();
        }else if ("XIAOMI".equals(carName)){
            return new Xiaomi();
        }else {
            return null;
        }
    }

}
