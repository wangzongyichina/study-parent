package com.wzy.study.other.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/14 13:14
 * @Desc:
 */

public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

//        Class<User> userClass = User.class;
        Class<?> userClass = Class.forName("com.wzy.study.other.reflection.User");
        System.out.println("userClass.getName() = " + userClass.getName());
        System.out.println("userClass.getSimpleName() = " + userClass.getSimpleName());

        Field[] fields = userClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        fields = userClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=============getMethods--method=============");
        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
        System.out.println("=============getDeclaredMethods--method=============");
        methods = userClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
        Method getName = userClass.getMethod("getName", null);
        System.out.println("getName = " + getName);
        Method setName = userClass.getMethod("setName", String.class);
        System.out.println("setName = " + setName);
        System.out.println("============= constructors =============");
        Constructor<?>[] constructors = userClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        constructors = userClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("declared  "+constructor);
        }
        Constructor<?> allConstructor = userClass.getDeclaredConstructor(String.class, int.class, Integer.class);
        System.out.println(allConstructor);


    }
}
