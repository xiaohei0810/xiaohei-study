package com.hand.strategyMode;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 5:56 下午
 * @Version 1.0
 * @Describtion 领用申请单
 */
public class LingyongForm implements ApplicationForm{
    @Override
    public void excute() {
        System.out.println("执行领用申请单单的业务逻辑");
    }

    @Override
    public String formType() {
        return "lingyong";
    }
}
