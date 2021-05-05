package com.wzy.study.gateway.lambda;

import com.wzy.study.gateway.entity.Person;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/3 14:47
 * @Desc:
 */

public class StreamDemo06 {
    public static void main(String[] args) {
        Person person = new Person("小明", 10, 1, false, true, null);

        List<Person> personList = Arrays.asList(new Person("小明", 10, 1, false, true, null),
            new Person("小红", 12, 0, false, true, null), new Person("小李", 13, 0, false, true, null),
            new Person("小刘", 15, 1, false, true, null), new Person("小王", 27, 1, false, true, null),
            new Person("小莫", 26, 0, false, true, null));

        List<Integer> collect = personList.stream().map(p -> p.getAge()).collect(Collectors.toList());
        // 尽量使用如下的方法引用 ， p.getAge() Person::getAge 这样可以少生成一个lambda$0 这样的函数
        List<Integer> collect1 = personList.stream().map(Person::getAge).collect(Collectors.toList());

        Set<Integer> collect2 = personList.stream().map(Person::getAge).collect(Collectors.toSet());
        TreeSet<Integer> collect3 = personList.stream().map(Person::getAge)
            .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect3);

        // 统计汇总信息
        IntSummaryStatistics statistics = personList.stream().collect(Collectors.summarizingInt(Person::getAge));
        System.out.println(statistics);
        System.out.println("statistics.getSum() = " + statistics.getSum());

        // 分块
        Map<Boolean, List<Person>> partintion = personList.stream()
            .collect(Collectors.partitioningBy(s -> s.getSex() == 1));
        System.out.println(partintion);
        System.out.println("partintion.get(true):"+partintion.get(true));

        // 分组
        Map<Integer, List<Person>> groupSex = personList.stream().collect(Collectors.groupingBy(Person::getSex));
        System.out.println(groupSex);

        Map<Integer, Long> groupSexCount = personList.stream().collect(Collectors.groupingBy(Person::getSex,Collectors.counting()));
        System.out.println(groupSexCount);

    }
}
