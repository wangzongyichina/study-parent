package com.wzy.study.design.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wzy.study.design.id.IdGeneratorOld;

import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/6 15:44
 * @Desc:
 */

public class Test {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Integer[] integers = objectMapper.convertValue(null, Integer[].class);
        Integer[] integers1 = new Integer[0];
        System.out.println(integers1);
        System.out.println(Objects.nonNull(integers1));
        Integer ii = 1;
        boolean b = Stream.of(integers1).anyMatch(i -> Objects.equals(ii,i));
        System.out.println(b);
        String id = IdGeneratorOld.generate();
        System.out.println("id = " + id);
    }
}
