package com.wzy.study.gateway.lambda;

import com.wzy.study.gateway.entity.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/2 23:41
 * @Desc:
 */

public class StreamDemo03 {
    public static void main(String[] args) {
        String str = "my name is wang zongyi";

        "my".chars().map(s -> s).forEach(System.out::println);
        System.out.println("my".chars().boxed());
        Arrays.stream(str.split(" ")).map(x -> x.toUpperCase()).peek(System.out::print).map(x -> x.length())
            .forEach(System.out::println);
        System.out.println("------map-------");
        Stream.of(str.split(" ")).map(s -> {
            Stream<Integer> boxed = s.chars().boxed();
            return boxed;
        }).forEach(i -> System.out.println(i.mapToInt(Integer::intValue)));

        System.out.println("------flatMap-------");
        Stream.of(str.split(" ")).flatMap(s -> {
            Stream<Integer> boxed = s.chars().boxed();
            return boxed;
        }).forEach(i -> System.out.println(i));

        System.out.println("------peek-------");
        Arrays.stream(str.split(" ")).peek(s -> s.replace("m", "M")).peek(s -> s.replace("w", "W"))
            .forEach(System.out::println);

        List<String> s1 =  Arrays.asList(str.split(" "));
        System.out.println("s1 = " + s1);
        List<String> newS1 = s1.stream().peek(s -> s.replace("m", "M")).peek(s -> s.replace("w", "W"))
            .collect(Collectors.toList());
        System.out.println("newS1 = " + newS1);

        System.out.println("------peek--PersonList-------");
        Person person = new Person();
        person.setName("小明");
        person.setAge(10);
        person.setSex(1);
        person.setABoolean(false);
        person.setAb(false);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        System.out.println(personList);
        List<Person> collect = personList.stream().peek(p -> p.setName("小红")).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("------limit-------");
         new Random().ints().filter(r -> r > 109 && r < 200).limit(3).forEach(System.out::println);


    }

}
