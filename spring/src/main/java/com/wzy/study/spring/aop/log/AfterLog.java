package com.wzy.study.spring.aop.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/3 14:10
 * @Desc:
 */

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("returnValue = " + returnValue);
        System.out.println("args = " + args);
        System.out.println("target = " + target);
//        method.invoke(target, returnValue);
    }
}
