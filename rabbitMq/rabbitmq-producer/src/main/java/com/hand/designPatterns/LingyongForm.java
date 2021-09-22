package com.hand.designPatterns;

import org.springframework.stereotype.Component;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:54 下午
 * @Version 1.0
 */
@Component
public class LingyongForm implements ApplicationForm,FormStrategy{
    @Override
    public void excute() {
        System.out.println("这里执行领用申请单的业务逻辑");
    }

    @Override
    public String formType() {
        return "lingyong";
    }

    @Override
    public ApplicationForm getForm() {
        return new LingyongFactory().getForm();
    }
}
