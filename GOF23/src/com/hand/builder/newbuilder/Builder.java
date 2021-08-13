package com.hand.builder.newbuilder;

/**
 * @Author xiaohei
 * @Date 2021/6/24 5:55 下午
 * @Version 1.0
 */
public abstract class Builder {

    abstract Builder buildDiji(String msg);
    abstract Builder buildShuini(String msg);
    abstract Builder buildGaifang(String msg);
    abstract Builder expend1(String msg);
    abstract Builder expend2(String msg);

    abstract NewHouseProduct productNewHouse();
}
