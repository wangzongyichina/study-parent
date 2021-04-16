package com.wzy.study.other.thread;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/28 16:42
 * @Desc:
 */

// 合理终止线程的方式, 打一个标记值
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable04 mr = new MyRunnable04();
        Thread thread = new Thread(mr);
        thread.setName("t");
        thread.start();
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 终止线程
        mr.flag = false;
    }
}

class MyRunnable04 implements Runnable {
    Boolean flag = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (flag) {
                System.out.println(Thread.currentThread().getName() + "---->" + i);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //保存数据等
            }
        }
    }
}
