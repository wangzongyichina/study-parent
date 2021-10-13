package com.wzy.study.other.date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.wzy.study.other.bean.Person;
import org.junit.Test;

import java.util.Date;
import java.util.Optional;

public class DateTest {


    @Test
    public void test() {
        Integer na = 10;
        String start = "2021-08-01 01:20:20";
        DateTime dateTimeStart = DateUtil.parseDate(start);

        String end = "2021-11-01 23:50:20";
        DateTime dateTimeEnd = DateUtil.parseDate(end);
        System.out.println("dateTimeStart = " + dateTimeStart);
        long between = DateUtil.between(new Date(),dateTimeEnd, DateUnit.DAY, false);
        System.out.println("between = " + between);
        System.out.println((between < na));
    }

    @Test
    public void test2(){
        int a = -1;
        int a2 = -1;
        Integer a3 = -129;
        Integer a4 = -129;
        System.out.println("(a==a2) = " + (a == a2));
//        System.out.println("(a==a2) = " + (a3 == a4));
        System.out.println("a3.equals(a4) = " + a3.equals(a4));

        Person person = new Person("kkk",12,2,false,false,null);
        String s = null;
        Person person1 = new Person();
        Person person2 = null;
                Optional.ofNullable(person2).ifPresent(p->person1.setName( p.getName()));
        System.out.println("s = " + person1);

    }


}
