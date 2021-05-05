package com.wzy.study.gateway.lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/3 10:27
 * @Desc:
 */

public class StreamDemo04 {
    public static void main(String[] args) {
        String str = "my name is wang zongyi";
        str.chars().parallel().forEach(i -> System.out.print((char) i));
        System.out.println("");
        str.chars().parallel().forEachOrdered(i -> System.out.print((char) i));
        System.out.println("");
        Optional<String> reduce = Stream.of(str.split(" ")).reduce((x, y) -> x + "|" + y);
        System.out.println(reduce);
        System.out.println(reduce.get());
        System.out.println(reduce.orElse("null"));

        String str1 = "";
        String reduce1 = Arrays.stream(str1.split("")).reduce("null", (x, y) -> x + "|" + y);
        System.out.println(reduce1);

        Integer reduce2 = Stream.of(str.split(" ")).map(s -> s.length()).reduce(0, (x, y) -> x.intValue()+y.intValue());
        System.out.println(reduce2);

        List<Integer> collect = Arrays.stream(str.split(" ")).map(s -> s.length()).collect(Collectors.toList());
        System.out.println(collect);

        Map map = new HashMap();
        List<Object> collect1 = Arrays.asList(str.split(" ")).stream().map(s -> map.put(s, s.length())).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println(map);


    }
}
