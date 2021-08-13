package com.hand.builder.newbuilder;

/**
 * @Author xiaohei
 * @Date 2021/6/24 6:01 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        BuildNewHouse buildNewHouse = new BuildNewHouse();
        NewHouseProduct newHouseProduct = buildNewHouse.productNewHouse();
        System.out.println(newHouseProduct);

        // 动态增加字段，创建对象
        NewHouseProduct houseProduct = new BuildNewHouse()
                .expend1("扩展字段1")
                .expend2("扩展字段2")
                .buildDiji("开开开开地基1111")
                .buildShuini("开开开开开水泥1111")
                .buildGaifang("开开开开开盖房1111")
                .productNewHouse();
        System.out.println(houseProduct);

    }
}
