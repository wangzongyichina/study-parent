package com.wzy.study.other.thread;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/28 15:34
 * @Desc:
 */

public class ThreadTest07 {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 myThread3 = new MyThread3();
        myThread3.setName("TT");
        myThread3.start();
        // 这行代码会让TT进入休眠状态吗?
        System.out.println("开始休眠");
        myThread3.sleep(2000);// 在执行时还是会装换成 Thread.sleep(1000), 所以不会，只会让main方法休眠

        System.out.println("hello world!");
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "----------->" + i);
        }
    }
}
