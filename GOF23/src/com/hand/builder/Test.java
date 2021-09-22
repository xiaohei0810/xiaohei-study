package com.hand.builder;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 3:45 下午
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("因特尔", "三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();

        try {
            // 原型模式克隆对象
            Computer clone = (Computer)computer.clone();
            System.out.println(computer+"hashcode："+computer.hashCode());
            System.out.println(clone+"hashcode："+clone.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
