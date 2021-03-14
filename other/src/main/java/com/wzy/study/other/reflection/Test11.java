package com.wzy.study.other.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/14 14:14
 * @Desc: 泛型参数信息
 */

public class Test11 {

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("===============getGenericParameterTypes===============");
        Method test01 = Test11.class.getDeclaredMethod("Test01", Map.class, List.class);
        Type[] genericParameterTypes = test01.getGenericParameterTypes();
        for (Type type : genericParameterTypes) {
            System.out.println("genericParameterType " + type);
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println("actualTypeArgument = " + actualTypeArgument);
                }
            }
            System.out.println("");
        }
        System.out.println("===============getGenericParameterTypes===============");
        Method test02 = Test11.class.getDeclaredMethod("Test02", null);
        Type genericReturnType = test02.getGenericReturnType();
        System.out.println("genericReturnType = " + genericReturnType);
        System.out.println();
        if (genericReturnType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println("actualTypeArgument = " + actualTypeArgument);
            }
        }

    }

    public void Test01(Map<String, User> map, List<User> list) {
        System.out.println("test01");
    }

    public Map<String, User> Test02() {
        System.out.println("test02");
        return null;
    }

}
