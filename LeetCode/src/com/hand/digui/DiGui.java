package com.hand.digui;

/**
 * @Author xiaohei
 * @Date 2021/6/10 7:10 下午
 * @Version 1.0
 */
public class DiGui {
    public static void main(String[] args) {
        /**
         * 1. 实现算法f(n) = f(n-1) + f(n-2)
         * 要求：1. 递归实现；2.时间复杂度O(N)
         */
        System.out.println(caculate(50));
    }

    public static int caculate(int num){
        if (num==0 || num == 1){
            return 1;
        }

        return caculate(num-1)+caculate(num-2);
    }

}
