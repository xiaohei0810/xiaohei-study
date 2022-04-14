package com.hand.strategyMode;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 5:55 下午
 * @Version 1.0
 * @Describtion 取得管理申请单
 */
public class QudeForm implements ApplicationForm{
    @Override
    public void excute() {
        System.out.println("执行取得管理申请单业务逻辑");
    }

    @Override
    public String formType() {
        return "qude";
    }
}
