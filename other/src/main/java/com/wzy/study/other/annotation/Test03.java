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

    @MyAnnotation03(name = "wangzongyi", age = 10, schools = {
        "湖南农业大学"
    })
    public void test03() {

    }

    @MyAnnotation04(name = 23)
    public void test01() {

    }

}
