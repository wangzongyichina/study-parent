package com.wzy.study.design.prototype;

/**
 * @Author: wangzongyi
 * @Data: 2021/10/26 21:01
 * @Desc:
 */

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 3, "白色");
        Sheep clone = (Sheep) sheep.clone();
        Sheep clone1 = (Sheep) sheep.clone();
        Sheep clone2 = (Sheep) sheep.clone();
        Sheep clone3 = (Sheep) sheep.clone();
        Sheep clone4 = (Sheep) sheep.clone();

        System.out.println(sheep.hashCode());
        sheep.setAge(5);
        System.out.println(clone.hashCode());
        System.out.println(clone1.hashCode());
        System.out.println(clone2==sheep);
        System.out.println(clone3.equals(clone));
        System.out.println(clone4);
    }
}
