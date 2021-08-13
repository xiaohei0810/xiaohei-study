package com.hand.builder;

/**
 * @Author xiaohei
 * @Date 2021/6/24 5:17 下午
 * @Version 1.0
 */

// 建造者
public abstract class Builder {

    /**
     *  比如: 建造房屋
     *      1、打地基
     *      2、和水泥
     *      3、盖房
     */

    //1、打地基
    abstract void buildDiji();

    //2、和水泥
    abstract void buildShuini();

    //3、盖房子
    abstract void buildGaifangzi();

    // 4、获取建造好的房子产品
    abstract HouseProduct productHouse();

}
