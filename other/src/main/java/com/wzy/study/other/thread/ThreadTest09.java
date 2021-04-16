package com.wzy.study.other.thread;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/28 16:37
 * @Desc:
 */

public class ThreadTest09 {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable03());
        thread.setName("t");
        thread.start();
        System.out.println("主线程睡眠5秒");
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程睡眠5秒结束");
        thread.stop(); //已过时 ，不建议使用，直接终止线程，可能导致丢数据
    }
}

class MyRunnable03 implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
