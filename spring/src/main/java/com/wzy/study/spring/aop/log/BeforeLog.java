package com.wzy.study.spring.aop.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/3 13:54
 * @Desc:
 */

public class BeforeLog implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("执行 BeforeLog");
        System.out.println(o.getClass().getName() + "的" + method.getName() + "方法执行了");
//        method.invoke(o, objects);
    }

}
