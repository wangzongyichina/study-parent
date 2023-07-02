package com.wzy.study.other.jvm;

/**
 * @Author: wangzongyi
 * @Date: 2023/6/11 16:41
 * @Desc:
 */

public class JvmTest {
    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("123");
        }
    }
}
