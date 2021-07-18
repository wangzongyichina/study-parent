package com.wzy.study.design.proxy.stati;

import com.wzy.study.design.proxy.Interface;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/3 9:25
 * @Desc:
 */

public class SimpleProxyDemo {
    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        System.out.println("--------");
//        consumer(realObject);
        System.out.println("--------");
        consumer(new SimpleProxy(realObject));
//        System.out.println("--------");
//        consumer(new SimpleProxy(new RealObject()));
    }

    public static void consumer(Interface inter) {
        inter.doSomething();
        System.out.println("**");
        inter.somethingElse("Demo");
    }
}
