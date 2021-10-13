package com.wzy.study.other.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: wangzongyi
 * @Data: 2021/9/12 0:33
 * @Desc:
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
    //这是注解的参数：参数类型+参数名 ();
    String name() default "";

    int age();

    String[] schools();
}
