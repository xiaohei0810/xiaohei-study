package com.hand.adapter;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/29 11:05 上午
 * @Version 1.0
 * @Describtion
 */
public class Test {
    public static void main(String[] args) {
        LogAdapter adapter = new LogAdapter(new NpLoggerImpl());
        adapter.debug("test","测试牛逼的日志打印方法");
    }
}
