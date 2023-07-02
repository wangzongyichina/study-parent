package com.wzy.study.other.annotation;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/13 17:49
 * @Desc:
 */

@TestAnnotation
public class Test {

    @TestAnnotation
    @org.junit.Test
    public void test(){
        MyContext01 myContext01 = new MyContext01(MyAnnotaConfig01.class);
    }

}
