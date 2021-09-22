package com.hand.strategyMode;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 11:10 上午
 * @Version 1.0
 * 策略模式
 */
public interface CalculateStrategy {

    /**
     * 计算方法
     * @param num1
     * @param num2
     * @return int
     */
    public int doCalculate(int num1,int num2);

}
