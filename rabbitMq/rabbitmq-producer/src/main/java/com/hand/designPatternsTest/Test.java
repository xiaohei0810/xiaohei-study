package com.hand.designPatternsTest;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:34 下午
 * @Version 1.0
 */
public class Test {

    @Autowired
    private static CalculateStrategy calculateStrategy;

    public static void main(String[] args) {
        System.out.println("111");
    }
}
