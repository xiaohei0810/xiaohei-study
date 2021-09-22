package com.hand.designPatterns;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:57 下午
 * @Version 1.0
 */
public class LingyongFactory implements FormFactory{
    @Override
    public ApplicationForm getForm() {
        return new LingyongForm();
    }
}
