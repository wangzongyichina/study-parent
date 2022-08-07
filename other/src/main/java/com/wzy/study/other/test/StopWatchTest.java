package com.wzy.study.other.test;


import cn.hutool.core.date.StopWatch;

public class StopWatchTest {
    public static void main(String[] args) throws InterruptedException {

        StopWatch s=new StopWatch();
        s.start("t0");
        Thread.sleep(500);
        s.stop();
        s.start("ta1");
        Thread.sleep(500);
        int i=0;
        try {
            int i1 = 10 / i;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("");
        }
        s.stop();

        System.out.println(s.getTotalTimeMillis());
        System.out.println("s.getLastTaskInfo() = " + s.getLastTaskInfo());
        System.out.println(s.prettyPrint());

        s.start();
        Thread.sleep(2000);
        s.stop();

        System.out.println(s.getTotalTimeMillis());
    }
}
