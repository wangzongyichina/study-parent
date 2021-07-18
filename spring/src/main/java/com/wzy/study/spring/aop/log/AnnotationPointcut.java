package com.wzy.study.spring.aop.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/3 17:17
 * @Desc:
 */

@Aspect
public class AnnotationPointcut {


    @Before(("execution(* com.wzy.study.spring.aop.*.*.*(..))"))
    public void before(){
        System.out.println("AnnotationPointcut --before");
    }

    @After("execution(* com.wzy.study.spring.aop.*.*.*(..))")
    public void after(){
        System.out.println("AnnotationPointcut --after");
    }

    @Around("execution(* com.wzy.study.spring.aop.*.*.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕前");
        point.proceed();
        System.out.println("环绕后");
        System.out.println("point.getSignature() = " + point.getSignature());
        System.out.println("point.getArgs() = " + point.getArgs());
        System.out.println("point.getThis() = " + point.getThis());
        System.out.println("point.getTarget() = " + point.getTarget());

    }

}
