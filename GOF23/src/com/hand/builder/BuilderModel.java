package com.hand.builder;

/**
 * @Author xiaohei
 * @Date 2021/6/24 5:24 下午
 * @Version 1.0
 */
public class BuilderModel extends Builder{

    private HouseProduct houseProduct;

    public BuilderModel() {
        houseProduct = new HouseProduct();
    }

    @Override
    void buildDiji() {
        houseProduct.setBuildDiji1("开始建地基了");
    }

    @Override
    void buildShuini() {
        houseProduct.setBuildShuini1("开始抗水泥了");
    }

    @Override
    void buildGaifangzi() {
        houseProduct.setBuildGaifangzi1("准备好了开始盖房子了");
    }

    @Override
    HouseProduct productHouse() {
        return houseProduct;
    }
}
