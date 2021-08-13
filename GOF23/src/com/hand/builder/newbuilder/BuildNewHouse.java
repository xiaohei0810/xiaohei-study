package com.hand.builder.newbuilder;

/**
 * @Author xiaohei
 * @Date 2021/6/24 5:58 下午
 * @Version 1.0
 */
public class BuildNewHouse extends Builder{

    private NewHouseProduct newHouseProduct;

    public BuildNewHouse() {
        newHouseProduct = new NewHouseProduct();
    }

    @Override
    Builder buildDiji(String msg) {
        newHouseProduct.setBuildDiji(msg);
        return this;
    }

    @Override
    Builder buildShuini(String msg) {
        newHouseProduct.setBuildKangshuini(msg);
        return this;
    }

    @Override
    Builder buildGaifang(String msg) {
        newHouseProduct.setBuildGaifang(msg);
        return this;
    }

    @Override
    Builder expend1(String msg) {
        newHouseProduct.setExpend1(msg);
        return this;
    }

    @Override
    Builder expend2(String msg) {
        newHouseProduct.setExpend2(msg);
        return this;
    }

    @Override
    NewHouseProduct productNewHouse() {
        return newHouseProduct;
    }
}
