package com.wzy.study.other.thread;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/28 17:20
 * @Desc:
 */

public class ThreadTest11 {
    public static void main(String[] args) {
        System.out.println("Thread.MAX_PRIORITY = " + Thread.MAX_PRIORITY);
        System.out.println("Thread.MIN_PRIORITY = " + Thread.MIN_PRIORITY);
        System.out.println("Thread.NORM_PRIORITY = " + Thread.NORM_PRIORITY);
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getName() + "-->" + Thread.currentThread().getPriority());
        Thread thread = new Thread(new MyRunnable05());
        thread.setPriority(10);
        thread.setName("m5");
        thread.start();
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + Thread.currentThread().getPriority());

        }
    }
}

class MyRunnable05 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + Thread.currentThread().getPriority());
        }
    }
}