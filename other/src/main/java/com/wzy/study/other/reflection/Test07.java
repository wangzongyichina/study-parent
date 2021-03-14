package com.wzy.study.other.reflection;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/14 13:03
 * @Desc:
 */

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        ClassLoader systemClassLoaderParent = systemClassLoader.getParent();
        System.out.println(systemClassLoaderParent);

        ClassLoader parent = systemClassLoaderParent.getParent();
        System.out.println(parent);

        ClassLoader classLoader = Test07.class.getClassLoader();
        System.out.println(classLoader);

        classLoader = Class.forName("java.lang.Override").getClassLoader();
        System.out.println(classLoader);

        String property = System.getProperty("java.class.path");
        System.out.println(property);
        String[] split = property.split(";");
//        for (String s : split) {
//            System.out.println(s);
//        }
        String property1 = System.getProperty("java.home");
        System.out.println(property1);

    }
}
