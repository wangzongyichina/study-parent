package com.wzy.study.other.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: wangzongyi
 * @Date: 2022/7/31 16:51
 * @Desc:
 */

public class StreamTest {

    @Test
    public void test1(){
        List<Employee> employees = new ArrayList<>();
        double v = employees.stream().mapToDouble(Employee::getSalary).average().orElse(-1);
        double v1 = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("v = " + v);
        System.out.println("v1 = " + v1);
        Employee employee = employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge))).orElse(null);

    }
}
