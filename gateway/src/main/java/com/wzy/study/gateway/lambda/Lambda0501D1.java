package com.wzy.study.gateway.lambda;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/1 16:00
 * @Desc:
 */

public class Lambda0501D1 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("你好呀");
        runnable.run();
    }
}
