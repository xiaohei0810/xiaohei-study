package com.hand;

import com.hand.enums.OrderLabelEnum;

/**
 * @author xiaohei
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
//        Car car = new BenzFactory().getCar();
//        car.name();
//        Car car1 = new BmwFactory().getCar();
//        car1.name();
//
//        com.hand.factory.simpleFactory.Car aodi = CarFactory.getAodi();
//        aodi.name();

        // 饿汗式，测试单例设计模式
//        SingleStatic instance = SingleStatic.getInstance();
//        System.out.println(instance);

        // 懒汉式
//        SingleNull instance = SingleNull.getInstance();
//        System.out.println(instance);

        // 懒汉式双重检查
//        SingDoubleNullCheck instance = SingDoubleNullCheck.getInstance();
//        System.out.println(instance);

        System.out.println(OrderLabelEnum.MARKETING_ACTIVITY_ORDER.name());
        System.out.println(OrderLabelEnum.values().toString());
        System.out.println(OrderLabelEnum.MARKETING_ACTIVITY_ORDER.getName());

    }
}
