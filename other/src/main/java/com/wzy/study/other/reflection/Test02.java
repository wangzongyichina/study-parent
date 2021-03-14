package com.wzy.study.other.reflection;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/13 18:24
 * @Desc:
 */

public class Test02 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c1 = Class.forName("com.wzy.study.other.reflection.User");
        System.out.println(c1);
        long uT1 = System.currentTimeMillis();
        User u1 = (User)c1.newInstance();
        System.out.println("(System.currentTimeMillis()-uT1) = " + (System.currentTimeMillis() - uT1));
        long uT2 = System.currentTimeMillis();
        User user = new User();
        System.out.println("(System.currentTimeMillis()-uT2) = " + (System.currentTimeMillis() - uT2));

    }
}
