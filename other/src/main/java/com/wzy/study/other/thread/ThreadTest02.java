package com.wzy.study.other.thread;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 22:42
 * @Desc:
 */

public class ThreadTest02 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        /**
         * start() 方法的作用是：
         * 启动一个分支线程、在jvm 中开辟一个新的栈空间，这段代码任务完成后，瞬间就结束了。这段代码的任务只是为了开启一个新的栈空间，
         * 只要新的栈空间开辟出来，start（）方法就结束了。线程就启动成功了。
         * 线程启动成功会自动调用run方法，并且run方法会在分支线程的栈底部（压栈）。
         * run方法在分支栈的栈底部，main方法在主栈的栈底部。run和 main是平级的。
         * 直接调用run（）方法，不会启动线程，不会分配新的栈分支栈。就不能并发，还是属于单线程。
         *
         * 注意：代码是至上而下执行的。myThread.start() 因为是开辟一个新栈空间，瞬间完成的，
         * */

        for (int i = 0; i < 1000; i++) {
            System.out.println("主=====线程--->" + i);

        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("运行分支线程-MyThread-->" + i);
        }
    }
}
