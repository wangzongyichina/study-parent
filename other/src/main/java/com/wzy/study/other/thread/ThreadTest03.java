package com.wzy.study.other.thread;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 23:18
 * @Desc:
 */

public class ThreadTest03 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread thread = new Thread(mr);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主===ThreadTest03==线程--->" + i);

        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("运行分支线程-MyRunnable-->" + i);
        }
    }
}
