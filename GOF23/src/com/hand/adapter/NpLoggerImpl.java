package com.hand.adapter;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/29 11:00 上午
 * @Version 1.0
 * @Describtion
 */
public class NpLoggerImpl implements NbLogger{
    @Override
    public void nbLoggerPrint(String message) {
        System.out.println("牛逼的日志打印方法,接受目标接口传递的参数:"+message);
    }
}
