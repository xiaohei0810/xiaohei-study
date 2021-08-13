package com.hand.deadlock;

/**
 * @Author xiaohei
 * @Date 2021/6/10 6:43 下午
 * @Version 1.0
 */
public class DeadLock {
    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = new Object();

        new Thread(()->{
            try {
                while (true){
                    synchronized (o1){
                        System.out.println(Thread.currentThread().getName()+"锁住o1对象");
                        Thread.sleep(1000);
                        synchronized (o2){
                            System.out.println(Thread.currentThread().getName()+"锁住o2对象");
                        }
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        ).start();

        new Thread(()->{
            try {
                while (true){
                    synchronized (o1){
                        System.out.println(Thread.currentThread().getName()+"锁住o2对象");
                        Thread.sleep(1000);
                        synchronized (o2){
                            System.out.println(Thread.currentThread().getName()+"锁住o1对象");
                        }
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        ).start();

    }
}
