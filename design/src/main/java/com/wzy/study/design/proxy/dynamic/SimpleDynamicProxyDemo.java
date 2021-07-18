package com.wzy.study.design.proxy.dynamic;

import com.wzy.study.design.proxy.Interface;
import com.wzy.study.design.proxy.stati.RealObject;

import java.lang.reflect.Proxy;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/3 9:50
 * @Desc:
 */

public class SimpleDynamicProxyDemo {
    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        System.out.println("----realObject---");
//        consumer(realObject);
        System.out.println("");
        Interface proxyInter = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[] {
            Interface.class
        }, new DynamicProxyHandler(realObject));
        System.out.println("(proxyInter instanceof  Interface) = " + (proxyInter instanceof Interface));
        System.out.println("---proxyInter---");
//        proxyInter.doSomething();
        consumer(proxyInter);
    }

    public static void consumer(Interface inter) {
        inter.doSomething();
        System.out.println("**");
        inter.somethingElse("demo");
    }
}
