package com.wzy.study.other.thread;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/21 0:01
 * @Desc:
 */

public class ThreadTest05 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread2 mt = new MyThread2();
        MyThread2 mt2 = new MyThread2();
        System.out.println(mt.getName());
//        mt.setName("wangzy");
        System.out.println(mt.getName());
        mt.start();
        mt2.start();

    }

    public void test(){

    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println();
        System.out.println(Thread.currentThread().getName()+"==运行--MyThread2");
        System.out.println(super.getName()+"=super=运行--MyThread2");
        System.out.println(this.getName()+"=this=运行--MyThread2");
        System.out.println();
    }
}
