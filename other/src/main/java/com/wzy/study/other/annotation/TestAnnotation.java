package com.wzy.study.other.annotation;

import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.RuntimeType;

import java.lang.annotation.*;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/13 17:11
 * @Desc:
 */

@Target(value = {ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})//描述注解使用范围
@Retention(value = RetentionPolicy.RUNTIME)//标识注解的生命周期、保留到什么级别
@Documented //说明该注解讲被包含在javadoc中
@Inherited //说明子类是可以继承父类的注解
public @interface TestAnnotation {
}
