package com.wzy.study.other.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/14 14:01
 * @Desc:
 */

public class Test10 {
    public static void main(String[] args) {
        test01();
        System.out.println("---");
        test02();
        System.out.println("---");
        test03();
    }

    public static void test01() {
        User user = new User("王综艺",1,26);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long end = System.currentTimeMillis();
        System.out.println("普通耗时:" + (end - start) + " ms");

    }

    public static void test02() {
        Class<?> cl = null;
        User user = null;
        Method getName = null;
        try {
            cl = Class.forName("com.wzy.study.other.reflection.User");
             getName = cl.getDeclaredMethod("getName");
            user = (User)cl.newInstance();
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        user.setName("王综艺");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            try {
                getName.invoke(user);
            }
            catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("反射耗时:" + (end - start) + " ms");

    }

    public static void test03() {
        Class<?> cl = null;
        User user = null;
        Method getName = null;
        try {
            cl = Class.forName("com.wzy.study.other.reflection.User");
            getName = cl.getDeclaredMethod("getName");
            getName.setAccessible(true);
            user = (User)cl.newInstance();
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        user.setName("王综艺");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            try {
                getName.invoke(user);
            }
            catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("反射关闭检查耗时:" + (end - start) + " ms");

    }

}
