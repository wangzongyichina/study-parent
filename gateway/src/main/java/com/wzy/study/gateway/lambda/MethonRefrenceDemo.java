package com.wzy.study.gateway.lambda;

import java.util.function.*;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/2 8:50
 * @Desc:
 */

public class MethonRefrenceDemo {
    public static void main(String[] args) {
        Dog dogX = new Dog("哮天犬");

        // 构造函数的方法引用
        System.out.println();
        System.out.println("------ 构造函数的方法引用-----");
        Supplier<Dog> supplier = Dog::new;
        System.out.println(supplier.get());
        Function<String, Dog> fg = Dog::new;
        System.out.println(fg.apply("旺财"));


        BiFunction<String, Integer, Dog> contructer = Dog::new;
        System.out.println(contructer.apply("wangcai", 20));
        System.out.println(contructer.toString());

        BiFunction<String, Integer, Dog> fg3 = Dog::new;
        Dog xww = fg3.apply("xww", 12);
//        xww = null;
        System.out.println(xww);
        xww.setAge(01);
        System.out.println(xww);



        // 非静态方法，使用类名来调用对象方法
        BiFunction<Dog, Integer, Integer> biFunction = Dog::eat;
        System.out.println();
        System.out.println("------ 使用类名来调用对象方法-----");
        biFunction.apply(dogX,5);

        BiConsumer<Dog, Integer> eatVoid = Dog::eatVoid;
        eatVoid.accept(dogX,1);



        // 非静态方法，使用实例对象方法引用1
        System.out.println();
        System.out.println("------ 非静态方法1-----");
        Function<Integer, Integer> function = dogX::eat;
        function.apply(5);
        IntUnaryOperator eat = dogX::eat;
        eat.applyAsInt(66);

        // 静态方法的方法引用
        System.out.println();
        System.out.println("------ 静态方法的方法引用-----");
        Consumer<Dog> dogConsumer = dog -> Dog.bark(dog);
        dogConsumer.accept(dogX);

        Consumer<Dog> dogConsumer2 = dog -> Dog.bark2(dog);
        dogConsumer2.accept(dogX);

        Consumer<Dog> dogConsumer3 = dog -> Dog.bark3(dog);
        dogConsumer3.accept(dogX);

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("你好");

        Consumer<String> consumer1 = System.out::print;
        consumer1.accept("你好1");

    }
}

class Dog {
    private String name = "哮天犬";

    private int num = 10;

    private int age = 0;

    public void setName(Dog this, String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum(Dog this) {
        return num;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public Dog(String name, int num, int age) {
        this.name = name;
        this.num = num;
        this.age = age;
    }

    public int eat(int num) {
        System.out.println("剩" + this.num + "斤狗粮！");
        int i = this.num - num;
        i = i < 0 ? 0 : i;
        System.out.println(this.name + "又吃了 " + num + " 斤狗粮");
        return i;
    }
    public int eatVoid(int num) {
        System.out.println("剩" + this.num + "斤狗粮！");
        int i = this.num - num;
        i = i < 0 ? 0 : i;
        System.out.println(this.name + "又吃了 " + num + " 斤狗粮");
        return 9;
    }

    public static void bark(Dog dog) {
        System.out.println(dog.name + "在狂叫！");
    }

    public static void bark2(Dog dog) {
        System.out.println(dog.name + "在狂叫2！");
    }

    public static Dog bark3(Dog dog) {
        System.out.println(dog.name + "改名字啦");
        dog.name = "new--" + dog.name;
        return dog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}