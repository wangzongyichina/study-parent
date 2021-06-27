package com.wzy.study.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/27 17:41
 * @Desc:
 */

public class HouseAgency implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public HouseAgency(Rent rent) {
        this.rent = rent;
    }

    public HouseAgency() {
    }

    /**
     * 为某个接口创建代理Foo ： InvocationHandler handler = new MyInvocationHandler(...); Class<?> proxyClass =
     * Proxy.getProxyClass(Foo.class.getClassLoader(), Foo.class); Foo f = (Foo)
     * proxyClass.getConstructor(InvocationHandler.class). newInstance(handler); 或更简单地： Foo f = (Foo)
     * Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class<?>[] { Foo.class }, handler);
     */

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), Rent.class.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(rent, args);
    }

}
