package com.wzy.study.gateway.lambda;

import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/2 8:40
 * @Desc:
 */

public class FunctionDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i > 8;
        System.out.println(predicate.test(9));
        IntPredicate intPredicate = i -> i < 0;
        IntPredicate intPredicate2 = i -> i < -5;
        System.out.println(intPredicate.test(9));
        System.out.println(intPredicate.negate().test(9));
        System.out.println("-----------");
        System.out.println(intPredicate.test(-1));
        System.out.println(intPredicate.and(intPredicate2).test(-1));
        System.out.println(intPredicate.or(intPredicate2).test(-1));
        System.out.println(intPredicate2.or(intPredicate).test(-1));


        Consumer<String> consumer = s -> System.out.println("输入的数据是：" + s);
        consumer.accept("hello world!");

    }
}
