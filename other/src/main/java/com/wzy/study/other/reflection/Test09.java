package com.wzy.study.other.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/14 13:35
 * @Desc:
 */

public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("com.wzy.study.other.reflection.User");

        User user = (User) c1.newInstance();
        System.out.println(user);

        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, Integer.class);
        declaredConstructor.setAccessible(true);
        User u2 = (User) declaredConstructor.newInstance("wangzongy", 01, 26);
        System.out.println(u2);

        Method setName = c1.getDeclaredMethod("setName", String.class);
        User u3 = new User();
        setName.invoke(u3, "王综艺");
        System.out.println("u3 = " + u3);
        System.out.println("========  =======");
        Class c2 = Class.forName("com.wzy.study.other.reflection.User");
        User us2 = (User)c2.newInstance();
        Field name = c2.getDeclaredField("name");
        name.setAccessible(true);
        name.set(us2,"王综艺u2");
        System.out.println("us2 = " + us2);


    }
}
