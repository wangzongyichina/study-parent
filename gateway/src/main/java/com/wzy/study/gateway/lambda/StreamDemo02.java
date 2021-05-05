package com.wzy.study.gateway.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/2 21:06
 * @Desc:
 */

public class StreamDemo02 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12, 88, 34, 8, 42);
        integerList.parallelStream();
        integerList.stream();

        Arrays.stream(new int[]{2,5,34,121});

        LongStream.of(12L,333L,3489L);
        System.out.println(IntStream.range(1, 999).sum());

        DoubleStream.of(23.2,78,56.09);


        System.out.println(new Random().nextInt());
        new Random().ints().limit(10);


        Stream.generate(()->new Random().nextInt(100));


    }
}
