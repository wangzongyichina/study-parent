package com.wzy.study.design.pattern.builder;

/**
 * @Author: wangzongyi
 * @Data: 2021/10/30 15:20
 * @Desc:
 */

public class JDKBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello Builder");
        System.out.println(builder);

        /**
         * Appendable 接口定义多个 append 方法。即 Appendable 为抽象建造者，定义了抽象方法
         * AbstractStringBuilder 虽然是抽象方法，但其实已经实现了 appendable 接口的方法，其实塔已经是
         *     建造者了，只是不能实例化而已
         * StringBuilder 即充当了指挥者的角色，同时充当了具体建造者的角色，建造方法的实现是由 AbstractStringBuilder
         *     已经实现了，StringBuilder 是继承了 父类的方法。
         */
    }
}
