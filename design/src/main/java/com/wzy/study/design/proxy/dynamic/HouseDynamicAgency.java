package com.wzy.study.design.proxy.dynamic;

import com.wzy.study.design.proxy.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/27 17:41
 * @Desc:
 */

public class HouseDynamicAgency implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public HouseDynamicAgency(Rent rent) {
        this.rent = rent;
    }

    public HouseDynamicAgency() {
    }

    /**
     * 为某个接口创建代理Foo ： InvocationHandler handler = new MyInvocationHandler(...); Class<?> proxyClass =
     * Proxy.getProxyClass(Foo.class.getClassLoader(), Foo.class); Foo f = (Foo)
     * proxyClass.getConstructor(InvocationHandler.class). newInstance(handler); 或更简单地： Foo f = (Foo)
     * Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class<?>[] { Foo.class }, handler);
     */
    // 生成得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(Rent.class.getClassLoader(), Rent.class.getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("HouseDynamicAgency-invoke");
        System.out.println("HouseDynamicAgency-arys = " + "arys");
        Object invoke = method.invoke(rent, args);
        return invoke;
    }

}
