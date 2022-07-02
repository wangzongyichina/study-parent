package com.wzy.study.design.pattern.proxy.dynamic;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @Author: wangzongyi
 * @Data: 2021/12/2 19:51
 * @Desc:
 */

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){

        /**
         * ClassLoader loader: 指定当前目标对象的加载器，获取加载器的方法是固定的
         * Class[] interfaces: 目标对象实现的接口类型，使用泛型的方式确认类型
         * InvocationHandler h： 事件处理，执行目标对象的方法时，会触发事件处理器的方法，
         *                  会把当前执行的目标对象的方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        Object invoke = method.invoke(target, objects);
                        return invoke;
                    }
                }) ;
    }

}
