package com.hand.designPatterns;

import org.springframework.stereotype.Component;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:02 下午
 * @Version 1.0
 */
@Component
public class DiaoboForm implements ApplicationForm,FormStrategy{
    @Override
    public void excute() {
        System.out.println("这里执行调拨申请单的业务逻辑");
    }

    @Override
    public String formType() {
        return "diaobo";
    }

    @Override
    public ApplicationForm getForm() {
        return new DiaoboFactory().getForm();
    }
}
