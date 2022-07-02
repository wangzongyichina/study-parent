package com.wzy.study.design.pattern.proxy.cjlb;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author wangzongyi
 * @Date
 */

public class CglibProxyFactory implements MethodInterceptor {

    // 维护一个目标对象
    private Object target;

    // 构造器，传入一个被代理的对象
    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    // 返回 目标对象（target） 的代理对象
    public Object getProxyInstance() {
        // 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类对象，即代理对象
        return enhancer.create();
        //

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式---开始");
        Object returnValue = method.invoke(target, objects);
        System.out.println("Cglib代理模式---提交");
        return returnValue;
    }
}
