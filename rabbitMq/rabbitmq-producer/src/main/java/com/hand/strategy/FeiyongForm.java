package com.hand.strategy;

import org.springframework.stereotype.Component;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 6:18 下午
 * @Version 1.0
 * @Describtion 费用申请单
 */
@Component
public class FeiyongForm implements ApplicationForm {
    @Override
    public void excute() {
        System.out.println("执行费用申请单业务逻辑");
    }

    @Override
    public String formType() {
        return "feiyong";
    }
}
