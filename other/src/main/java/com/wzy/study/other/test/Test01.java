package com.wzy.study.other.test;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/17 23:35
 * @Desc:
 */

public class Test01 {
    public static void main(String[] args) {
        Long lo1 = 127L;
        Long lo2 = 127L;
        System.out.println("(lo1 == lo2) = " + (lo1 == lo2));
        System.out.println("(lo1.equals(lo2)) = " + (lo1.equals(lo2)));
        System.out.println("(lo1.longValue()==lo2.longValue()) = " + (lo1.longValue() == lo2.longValue()));
    }
}
