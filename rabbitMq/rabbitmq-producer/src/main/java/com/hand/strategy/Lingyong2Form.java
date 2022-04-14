package com.hand.strategy;

import org.springframework.stereotype.Component;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 5:56 下午
 * @Version 1.0
 * @Describtion 领用申请单
 */
@Component
public class Lingyong2Form implements ApplicationForm{
    @Override
    public void excute() {
        System.out.println("执行领用申请单单的业务逻辑");
    }

    @Override
    public String formType() {
        return "lingyong";
    }
}
