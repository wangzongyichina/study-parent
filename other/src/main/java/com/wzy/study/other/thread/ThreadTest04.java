package com.wzy.study.other.thread;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 23:25
 * @Desc:
 */

public class ThreadTest04 {
    // 采用匿名内部类的方式
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("分支线程-匿名内部类的方式-->" + i);
                }
            }
        }).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主===ThreadTest04==线程--->" + i);

        }

    }
}
