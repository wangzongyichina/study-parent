package com.wzy.study.other.thread;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/28 16:24
 * @Desc:
 */

import lombok.SneakyThrows;

/**
 * 叫醒一个正在睡眠的方法,buzhi
 */
public class ThreadTest08 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable02());
        thread.setName("t");
        thread.start();

        Thread.sleep(2000);
        System.out.println("主线程睡眠结束");
        // interrupt() 这种中断睡眠的方式依靠了java的异常处理机制
        thread.interrupt();
    }
}

class MyRunnable02 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->begin");
        try {
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        }
        catch (InterruptedException e) {
            System.out.println("打印异常信息");
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "--->end");
    }
}