package com.hand;

import com.hand.factory.methodFactory.BenzFactory;
import com.hand.factory.methodFactory.BmwFactory;
import com.hand.factory.methodFactory.Car;
import com.hand.factory.simpleFactory.CarFactory;

/**
 * @author xiaohei
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new BenzFactory().getCar();
        car.name();
        Car car1 = new BmwFactory().getCar();
        car1.name();

        com.hand.factory.simpleFactory.Car aodi = CarFactory.getAodi();
        aodi.name();

    }
}
