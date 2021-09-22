package com.hand.designPatterns;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:02 下午
 * @Version 1.0
 */
public class DiaoboFactory implements FormFactory{
    @Override
    public ApplicationForm getForm() {
        return new DiaoboForm();
    }
}
