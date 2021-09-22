package com.hand.designPatterns;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:05 下午
 * @Version 1.0
 */
public interface FormStrategy {

    String formType();

    ApplicationForm getForm();

}
