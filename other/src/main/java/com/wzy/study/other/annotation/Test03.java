package com.wzy.study.other.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/13 18:00
 * @Desc:
 */

public class Test03 {

    @MyAnnotation03(name = "wangzongyi",age = 23,schools = {"湖南农业大学"})
    public void test03(){

    }
    @MyAnnotation04(name = 23)
    public void test01(){

    }

}

@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
    //这是注解的参数：参数类型+参数名 ();
    String name() default "";
    int age();
    String[] schools();
}

@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation04{
    int name();
}
