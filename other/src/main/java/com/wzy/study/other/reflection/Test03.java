package com.wzy.study.other.reflection;

import com.wzy.study.other.annotation.TestAnnotation;

import java.lang.annotation.ElementType;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/13 19:22
 * @Desc:
 */

public class Test03 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class cc1 = Object.class;
        Class cc2 = String[].class;
        Class cc3 = int[][].class;
        Class cc4 = int.class;
        Class cc5 = Integer.class;
        Class cc6 = Override.class;
        Class cc7 = ElementType.class;
        Class cc8 = void.class;
        Class cc9 = Class.class;
        Class cc10 = Runnable.class;
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
        System.out.println(cc4);
        System.out.println(cc5);
        System.out.println(cc6);
        System.out.println(cc7);
        System.out.println(cc8);
        System.out.println(cc9);
        System.out.println(cc10);

        Person person = new Teacher();
        System.out.println(" 他是 "+person.name);

        Class c1 = person.getClass();
        Teacher o = (Teacher)c1.newInstance();
        System.out.println(c1+" 他是 "+o.name);
        Class c2 = Class.forName("com.wzy.study.other.reflection.Student");
        System.out.println(c2+" 他是 "+c2.getName());
        Class<Student> c3 = Student.class;
        System.out.println(c3+" 他是 "+c3.getName());

        Class<Integer> integerClass = Integer.class;
        System.out.println("integerClass = " + integerClass);
        Class<Integer> type = Integer.TYPE;
        System.out.println("type = " + type);

        Class superclass = c1.getSuperclass();
        System.out.println("superclass = " + superclass);
        Class superclass1 = Integer.class.getSuperclass();
        System.out.println("superclass1 = " + superclass1);
        Class<Integer> integerClass1 = int.class;
        System.out.println("integerClass1 = " + integerClass1);

        Class<Class> classClass = Class.class;
        System.out.println("classClass = " + classClass);
        Class<Enum> enumClass = Enum.class;
        Class<TestAnnotation> testAnnotationClass = TestAnnotation.class;
        System.out.println("testAnnotationClass = " + testAnnotationClass);
        Class<Void> voidClass = void.class;
        System.out.println("voidClass = " + voidClass);

    }
}
