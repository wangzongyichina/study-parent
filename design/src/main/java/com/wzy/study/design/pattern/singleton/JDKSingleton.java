package com.wzy.study.design.pattern.singleton;

import java.util.Calendar;

/**
 * @Author: wangzongyi
 * @Data: 2021/10/26 20:55
 * @Desc:
 */

public class JDKSingleton {
    public static void main(String[] args) {
        System.out.println("Runtime.getRuntime() = " + Runtime.getRuntime().freeMemory());
        Calendar.getInstance();
    }
}
