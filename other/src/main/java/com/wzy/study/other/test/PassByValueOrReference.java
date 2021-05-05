package com.wzy.study.other.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/2 16:03
 * @Desc:
 */

public class PassByValueOrReference {
    public static void main(String[] args) {

        String aa = "I am  a";
        String bS =aa ;
        aa = aa+" after!";
        aa = bS;
        System.out.println(aa);

        StringBuffer aabf = new StringBuffer("I am  a");
        StringBuffer baBf =aabf ;
        aabf = aabf.append(" after!");
        aabf = baBf;
        System.out.println(aabf);

        String mainStr = "Main-str";
        test5(mainStr);
        System.out.println("mainStr:"+mainStr);

        StringBuffer mainSbf = new StringBuffer("Main-strBuff");
        test6(mainSbf);
        System.out.println("mainSbf:"+mainSbf);

        Person person = new Person();
        person.setName("小明");
        person.setAge(10);
        person.setSex(1);
        person.setABoolean(false);
        person.setAb(false);
        List<Integer> il = Arrays.asList(1, 2);
        person.setList(il);
        System.out.println("main === " + person);
        System.out.println("main =.hashCode()== " + person.hashCode());
        PassByValueOrReference pass = new PassByValueOrReference();
        test1(person);
        System.out.println("main === " + person);
        System.out.println("main =.hashCode()== " + person.hashCode());
//        Person person2 = test2(person);
//        System.out.println("main =person2== " + person);

        List<Integer> list = Arrays.asList(12, 23);
        test3(list);
        System.out.println("main =list== " + list);

        boolean b = false;
        test4(b);

        System.out.println("main =bb== " + b);

        Boolean bb = false;
        test3(bb);
        System.out.println("main =bb== " + bb);

        // int i = 10;
        // String str = "hello";
        // System.out.println(str.hashCode());
        //
        // String str2 = "world";
        // String str4 = "world";
        // String str3 = str;
        // System.out.println(str.equals(str3));
        // System.out.println(str.equals(str2));
        // System.out.println(str4.equals(str2));
        // System.out.println(str2.hashCode());
        // System.out.println(str4.hashCode());
        // System.out.println(str.hashCode());

    }

    public static void test1(Person person) {
        person.setName("小红");
        person.setAge(12);
        person.setSex(0);
        person.setABoolean(true);
        person.setAb(true);
        List<Integer> il = Arrays.asList( 3, 4,5,6,7);
        person.setList(il);
        System.out.println("test1 === " + person);
        System.out.println("test1 ===.hashCode()== " + person.hashCode());

    }

    public static Person test2(Person person) {
        person.setName("小红");
        person.setAge(12);
        person.setSex(0);
        System.out.println("test2 === " + person);
        return person;
    }

    public static void test3(List list) {
        list = null;
        System.out.println("test3 =list== " + list);
    }

    public static void test3(Boolean aBoolean) {
        aBoolean = true;
        System.out.println("test3 =aBoolean== " + aBoolean);

    }

    public static void test4(boolean b) {
        b = true;
        System.out.println("test3 =b== " + b);

    }

    public static void test5(String  str) {
        str = "test5-str";
        System.out.println("test3 =str== " + str);
    }
    public static void test6(StringBuffer  buffer) {
        buffer = buffer.append("test5-buffer");
        System.out.println("test3 =buffer== " + buffer);
    }

}
