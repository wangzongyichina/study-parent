package com.wzy.study.other.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/13 19:18
 * @Desc:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    protected String name;
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}
class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}
