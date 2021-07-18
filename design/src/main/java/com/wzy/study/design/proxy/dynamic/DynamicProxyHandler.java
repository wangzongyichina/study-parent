package com.wzy.study.design.proxy.dynamic;

import com.wzy.study.design.proxy.Interface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Objects;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/3 9:44
 * @Desc:
 */

public class DynamicProxyHandler implements InvocationHandler {

    private Interface proxied;

    public DynamicProxyHandler(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("DynamicProxyHandler invoke");
//        System.out.println("DynamicProxyHandler proxy " + proxy.getClass());
//        System.out.println("DynamicProxyHandler method " + method.getName());
//        System.out.println("DynamicProxyHandler args " + args);
//        System.out.println("(proxy instanceof InvocationHandler) = " + (proxy instanceof InvocationHandler));
//        System.out.println("(proxy instanceof DynamicProxyHandler) = " + (proxy instanceof DynamicProxyHandler));
//        System.out.println("proxied = " + proxied);
//        System.out.println("(proxy instanceof Proxy) = " + (proxy instanceof Proxy));
//        System.out.println("(proxied instanceof Proxy) = " + (proxied instanceof Proxy));
//        System.out.println("(proxied instanceof Interface) = " + (proxied instanceof Interface));
//        System.out.println("(proxy instanceof Proxy) = " + (proxy instanceof Proxy));
        return method.invoke(proxied, args);
    }

}
