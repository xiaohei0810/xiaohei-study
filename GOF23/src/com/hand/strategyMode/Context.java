package com.hand.strategyMode;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 11:17 上午
 * @Version 1.0
 */
public class Context {

    private CalculateStrategy strategy;

    public Context(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public int  calculate(int num1,int num2){
        return strategy.doCalculate(num1,num2);
    }

    public static void main(String[] args) {
        // +，实例化的调用位置
        Context context = new Context(new CalculateAdd());
        System.out.println("1+2="+context.calculate(1, 2));

        // -
        Context context1 = new Context(new CalculateDes());
        System.out.println("1-2="+context1.calculate(1, 2));

        // *
        Context context2 = new Context(new CalculateMul());
        System.out.println("1*2="+context2.calculate(1, 2));
    }

}
