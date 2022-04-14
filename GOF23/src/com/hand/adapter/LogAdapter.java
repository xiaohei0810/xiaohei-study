package com.hand.adapter;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/29 10:49 上午
 * @Version 1.0
 * @Describtion
 */
public class LogAdapter implements LogFactory{

    private NbLogger nbLogger;

    public LogAdapter(NbLogger nbLogger){
        this.nbLogger = nbLogger;
    }

    @Override
    public void debug(String s1, String message) {
        System.out.println("这是普通的日志记录方法：");
        nbLogger.nbLoggerPrint(message);
    }
}
