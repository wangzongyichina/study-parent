package com.wzy.study.other.reflection;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/14 11:17
 * @Desc:
 */

public class Test06 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Father father = new Father();

//        Son son = new Son();
//        System.out.println("son.m = " + son.m);

        Class<?> name = Class.forName("com.wzy.study.other.reflection.Son");
//        Object o = name.newInstance();

        // 子类调用父类的静态属性、静态方法。不会加载子类，只加载父类
//        System.out.println("Son.m = " + Son.s);
//        Son.test();

//        Son[] sons = new Son[5];

//        System.out.println(Son.M);

    }

    static {
        System.out.println("Main静态代码块初始化");
    }

    {
        System.out.println("Main非静态代码块初始化");
    }
}

class Father{
    static String s = "father";
    static int ii = 20;

    static {
        System.out.println("父类静态代码块初始化");
    }

    {
        System.out.println("--父类非静态代码块初始化");

    }
    public static void test(){
        System.out.println("调用父类的静态方法");
    }

    public  void noStatic(){
        System.out.println("调用父类的f非静态方法");
    }


}

class Son extends Father{

    static final  int  M = 1000;
    static  int m = 100;

    static {
        System.out.println("son子类静态代码块初始化");
        m = 300;
    }

    {
        System.out.println("son子类非静态代码块初始化");
        m = 300;
    }

    public static void test(){
        System.out.println("调用son子类的静态方法");
    }

    public  void noStatic(){
        System.out.println("调用son子类的f非静态方法");
    }


}