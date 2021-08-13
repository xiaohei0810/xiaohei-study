package com.hand.builder;

/**
 * @Author xiaohei
 * @Date 2021/6/24 5:20 下午
 * @Version 1.0
 */
public class HouseProduct {

    private String buildDiji1;
    private String buildShuini1;
    private String buildGaifangzi1;

    public String getBuildDiji1() {
        return buildDiji1;
    }

    public void setBuildDiji1(String buildDiji1) {
        this.buildDiji1 = buildDiji1;
    }

    public String getBuildShuini1() {
        return buildShuini1;
    }

    public void setBuildShuini1(String buildShuini1) {
        this.buildShuini1 = buildShuini1;
    }

    public String getBuildGaifangzi1() {
        return buildGaifangzi1;
    }

    public void setBuildGaifangzi1(String buildGaifangzi1) {
        this.buildGaifangzi1 = buildGaifangzi1;
    }

    @Override
    public String toString() {
        return "HouseProduct{" +
                "buildDiji1='" + buildDiji1 + '\'' +
                ", buildShuini1='" + buildShuini1 + '\'' +
                ", buildGaifangzi1='" + buildGaifangzi1 + '\'' +
                '}';
    }
}
