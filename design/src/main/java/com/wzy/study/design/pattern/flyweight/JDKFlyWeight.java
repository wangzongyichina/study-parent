package com.wzy.study.design.pattern.flyweight;

/**
 * @Author: wangzongyi
 * @Data: 2021/12/1 19:43
 * @Desc:
 */

public class JDKFlyWeight {
    public static void main(String[] args) {

        // 如果 num 在 -128 ~ 127 范围，就是从缓存中拿， Integer.valueOf(num) 就是使用了享元（蝇量）模式
        int num = 127;
        Integer x = Integer.valueOf(num);
        Integer y = new Integer(num);
        Integer z = Integer.valueOf(num);
        Integer w = new Integer(num);
        System.out.println(x.equals(y));   // ture
        System.out.println(x == y);   // false
        System.out.println(x == z);   // ture
        System.out.println(w == x);   // false
        System.out.println(w == y);   // false
    }
}
