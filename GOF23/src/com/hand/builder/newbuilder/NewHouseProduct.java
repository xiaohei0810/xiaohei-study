package com.hand.builder.newbuilder;

/**
 * @Author xiaohei
 * @Date 2021/6/24 5:56 下午
 * @Version 1.0
 */
public class NewHouseProduct {

    private String buildDiji = "开始打造地基";
    private String buildKangshuini = "开始和水泥";
    private String buildGaifang = "都准备好了";
    //扩展字段
    private String expend1;
    private String expend2;

    @Override
    public String toString() {
        return "NewHouseProduct{" +
                "buildDiji='" + buildDiji + '\'' +
                ", buildKangshuini='" + buildKangshuini + '\'' +
                ", buildGaifang='" + buildGaifang + '\'' +
                ", expend1='" + expend1 + '\'' +
                ", expend2='" + expend2 + '\'' +
                '}';
    }

    public String getExpend1() {
        return expend1;
    }

    public void setExpend1(String expend1) {
        this.expend1 = expend1;
    }

    public String getExpend2() {
        return expend2;
    }

    public void setExpend2(String expend2) {
        this.expend2 = expend2;
    }

    public String getBuildDiji() {
        return buildDiji;
    }

    public void setBuildDiji(String buildDiji) {
        this.buildDiji = buildDiji;
    }

    public String getBuildKangshuini() {
        return buildKangshuini;
    }

    public void setBuildKangshuini(String buildKangshuini) {
        this.buildKangshuini = buildKangshuini;
    }

    public String getBuildGaifang() {
        return buildGaifang;
    }

    public void setBuildGaifang(String buildGaifang) {
        this.buildGaifang = buildGaifang;
    }

}
