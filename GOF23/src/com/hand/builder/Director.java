package com.hand.builder;

/**
 * @Author xiaohei
 * @Date 2021/6/24 5:27 下午
 * @Version 1.0
 */
public class Director {

    // 指导盖房子
    public HouseProduct product(BuilderModel builderModel){
        builderModel.buildDiji();
        builderModel.buildShuini();
        builderModel.buildGaifangzi();
        return builderModel.productHouse();
    }

}
