package com.wzy.study.other.annotation;

import java.lang.annotation.Annotation;

/**
 * @Author: wangzongyi
 * @Date: 2023/6/30 0:58
 * @Desc:
 */

public class MyContext01 {

    private Class configClass;

    public MyContext01(Class configClass){
        this.configClass = configClass;
        if(configClass.isAnnotation()){
            MyAnnotation03 annotation = (MyAnnotation03) configClass.getAnnotation(MyAnnotation03.class);
            annotation.schools();
        }
    }
}
