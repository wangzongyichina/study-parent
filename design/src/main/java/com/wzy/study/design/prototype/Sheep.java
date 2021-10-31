package com.wzy.study.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: wangzongyi
 * @Data: 2021/10/26 20:57
 * @Desc:
 */

@Data
@AllArgsConstructor
public class Sheep implements Cloneable {

    private String name;

    private Integer age;

    private String color;

    private String address="新疆羊";

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return sheep;
    }

}
