package com.wzy.study.gateway.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/2 20:43
 * @Desc:
 */

/**
 * 惰性求值
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 88, 34, 8, 42);
        integers.stream().forEach(System.out::println);

        int[] integers1 = {
            12, 88, 34, 8, 42
        };
        // map  就是中间操作
        System.out.println(IntStream.of(integers1).map(x -> x * 2 ).sum());
        // 惰性求值，就是终止操作没有调用的时候，中间操作（map）不会执行，如下
        System.out.println("没有终止操作："+IntStream.of(integers1).map(StreamDemo01::doubleNum));
        System.out.println("------");
        // 惰性求值，有调用终止操作 sum ,执行了中间操作，如下
        System.out.println("sum求和终止操作："+IntStream.of(integers1).map(StreamDemo01::doubleNum).sum());

    }

    public static int doubleNum(int num) {
        System.out.println(num + "乘以了2后是 " + num * 2);
        return num * 2;
    }

}
