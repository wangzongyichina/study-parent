package com.wzy.study.gateway.lambda;

import com.wzy.study.gateway.entity.Person;
import org.junit.Test;

import java.util.Optional;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/4 12:32
 * @Desc:
 */

public class OptionalTest {

    @Test
    public void test4() {
        // Person person = null;
        Person person = new Person();
        Optional.ofNullable(person).ifPresent(p -> {
            System.out.println("ifPresent");
        });
    }

    @Test
    public void test3() throws Exception {
        Person person = new Person();
//         Person person = null;
        Person person1 = Optional.ofNullable(person).map(p -> {
            p.setName("newName");
            p.setAge(23);
            return p;
        }).orElseThrow(() -> new Exception("异常咯"));
        System.out.println("person1 = " + person1);
    }

    @Test
    public void test5() throws Exception {
        // Person person = new Person();
        Person person = null;
        Person orElse = Optional.ofNullable(person).map(p -> {
            p.setName("nu");
            return p;
        }).orElse(new Person("orElse"));
        System.out.println("orElse = " + orElse);
    }

    @Test
    public void test6() throws Exception {
        // Person person = new Person();
        Person person = null;
        Person orElseGet = Optional.ofNullable(person).map(p -> {
            p.setName("nu");
            return p;
        }).orElseGet(() -> {
            Person p2 = new Person("orElseGet");
            return p2;
        });
        System.out.println("orElseGet = " + orElseGet);
    }

    @Test
    public void test7() throws Exception {
        // Person person = new Person();
        Person person = null;
        Optional.ofNullable(person).map(p -> {
            p.setName("nu");
            return p;
        }).orElseThrow(() -> new Exception("产生了异常"));
    }

    @Test
    public void test2() {
        Person person = null;
        Person orElseGet = Optional.ofNullable(person).orElseGet(() -> createPerson());
        System.out.println("orElseGet = " + orElseGet);
    }

    @Test
    public void test1() {
        Person person = null;
        Person orElse = Optional.ofNullable(person).orElse(createPerson());
        Person person1 = Optional.ofNullable(person).orElse(person);
        Optional<Person> person2 = Optional.ofNullable(person);
        Optional<Person> orElse1 = Optional.ofNullable(orElse);
        System.out.println("orElse = " + orElse);
        System.out.println("orElse1 = " + orElse1);
        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
        System.out.println(Optional.ofNullable(person).isPresent());
        Optional<Person> optionalPerson = Optional.ofNullable(person);
        System.out.println(optionalPerson);
    }

    private Person createPerson() {
        Person person = new Person();
        person.setName("test");
        return person;
    }

    private Person createPerson(String name, Integer age, Boolean ab) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setAb(ab);
        return person;
    }

}
