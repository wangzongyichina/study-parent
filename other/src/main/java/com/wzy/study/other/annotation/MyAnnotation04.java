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
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation04 {
    int name();
}
