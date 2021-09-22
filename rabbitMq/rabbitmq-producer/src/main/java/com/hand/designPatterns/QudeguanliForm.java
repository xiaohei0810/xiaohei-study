package com.hand.designPatterns;

import org.springframework.stereotype.Component;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:03 下午
 * @Version 1.0
 */
@Component
public class QudeguanliForm implements ApplicationForm,FormStrategy{
    @Override
    public void excute() {
        System.out.println("这里执行取得管理申请单的业务逻辑");
    }

    @Override
    public String formType() {
        return "qude";
    }

    @Override
    public ApplicationForm getForm() {
        return new QudeguanliFactory().getForm();
    }
}
