package com.wzy.study.other.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/14 15:00
 * @Desc:
 */

public class Test12 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Student1> sc = Student1.class;
        TableStudent declaredAnnotation = sc.getDeclaredAnnotation(TableStudent.class);
        TableStudent annotation = sc.getAnnotation(TableStudent.class);
        System.out.println(declaredAnnotation.value());

        Field id = sc.getDeclaredField("id");
        FieldStudent fieldStudent = id.getAnnotation(FieldStudent.class);
        System.out.println(fieldStudent.name());
    }

}

@TableStudent("db_student")
class Student1 {

    @FieldStudent(name = "db_id", type = "int", length = 10)
    private int id;

    @FieldStudent(name = "db_age", type = "int", length = 10)
    private int age;

    @FieldStudent(name = "db_name", type = "varchar", length = 10)
    private String name;

    public Student1() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student1(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" + "id=" + id + ", age=" + age + ", name='" + name + '\'' + '}';
    }
}

// 类注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableStudent {
    String value();
}

// 属性注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldStudent {
    String name();

    String type();

    int length();
}