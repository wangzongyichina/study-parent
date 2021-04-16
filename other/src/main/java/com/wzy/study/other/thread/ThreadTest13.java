package com.wzy.study.other.thread;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/28 17:42
 * @Desc:
 */

public class ThreadTest13 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable07());
        thread.setName("my07");
        thread.start();
        System.out.println(Thread.currentThread().getName()+"》》begin");
        try {
            // thread 合并到当前线程中，当前线程受阻塞，直到 thread 线程执行结束后。
            thread.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"》》end");
    }
}
class MyRunnable07 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ">>" + i);
        }
    }
}
