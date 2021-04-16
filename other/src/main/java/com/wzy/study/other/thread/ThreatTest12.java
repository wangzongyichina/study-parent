package com.wzy.study.other.thread;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/28 17:30
 * @Desc:
 */

/**
 * yeild() 静态方法  让位
 * 当前线程暂停，回到就绪状态，把CPU时间片让给其他线程
 */
public class ThreatTest12 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable06());
        thread.setName("my06");
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

class MyRunnable06 implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%10 ==0){
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + "礼让一下");
            }
        }
        System.out.println(Thread.currentThread().getName() + "->" );
    }
}