package com.hand.designPatterns;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:03 下午
 * @Version 1.0
 */
public class QudeguanliFactory implements FormFactory{
    @Override
    public ApplicationForm getForm() {
        return new QudeguanliForm();
    }
}
