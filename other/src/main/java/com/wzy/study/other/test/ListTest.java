package com.wzy.study.other.test;

import com.wzy.study.other.bean.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangzongyi
 * @Data: 2021/10/19 20:44
 * @Desc:
 */

public class ListTest {

    @Test
    public void testObjectList(){
        Student student = new Student(11, 18, "小红", "湖南长沙");
        List<Student> list = new ArrayList<>();
        list.add(student);
        System.out.println("list = " + list);
        student.setAddress("广东深圳");

        List<Student> list2 = new ArrayList<>();
        list2.add(student);
        System.out.println("list2 = " + list2);
        System.out.println("list = " + list);
    }

}
