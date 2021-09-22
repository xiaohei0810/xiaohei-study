package com.hand.strategyMode;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 11:15 上午
 * @Version 1.0
 */
public class CalculateDes implements CalculateStrategy{
    @Override
    public int doCalculate(int num1, int num2) {
        return num1 - num2;
    }
}
