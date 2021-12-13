package com.wzy.study.other.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("tom", 'm', 12);
        Employee e2 = new Employee("tom2", 'm', 14);
        Employee e3 = new Employee("tom3", 'm', 14);
        Employee e4 = new Employee("tom4", 'm', 10);
        Employee e7 = new Employee("tom7", 'm', 29);
        Employee e5 = new Employee("tom5", 'm', 19);
        Employee e6 = new Employee("tom6", 'm', 20);
        Employee w = Arrays.asList(e1, e2, e3, e4, e5, e6, e7).stream().filter(s -> Objects.equals('m', s.getSex())).max(Comparator.comparing(Employee::getAge)).orElse(null);
        if (Objects.isNull(w)){

        }

        System.out.println("w = " + w);
        System.out.println(Objects.isNull(w));
//        System.out.println(w.getAge());
//        System.out.println("w = " + w);

    }
}
