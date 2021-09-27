package com.hand.single.singleDoubleNull;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/23 10:35 上午
 * @Version 1.0
 * 懒汉式双重检查，推荐。
 */
public class SingDoubleNullCheck {
    private static volatile SingDoubleNullCheck instance;

    private SingDoubleNullCheck(){

    }

    public static SingDoubleNullCheck getInstance(){
        if (instance == null){
            synchronized (SingDoubleNullCheck.class){
                if (instance == null){
                    instance = new SingDoubleNullCheck();
                }
            }
        }
        return instance;
    }
}
