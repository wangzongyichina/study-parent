package com.wzy.study.gateway.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/2 20:13
 * @Desc:
 */

public class VarDemo {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        list.add("xiaom");
        list.add("xiaom22");
        Consumer<String> consumer = s -> System.out.println(s + list);
        list.add("xiaom33");
        list.add("xiaom44");
        consumer.accept("kkkk");
        list.add("xiaom55");
        consumer.accept("12");
        String str = "hello world";
        str = "123";
        Consumer<String> strConsumer = s -> System.out.println(s);
        strConsumer.accept(str);
    }
}
