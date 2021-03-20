package com.wzy.study.other.io;

import com.wzy.study.other.bean.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 19:47
 * @Desc:
 */

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        Student st = new Student(12, 23,"小明","广东");
        OutputStream opt = new FileOutputStream("other/src/main/resources/student");
        ObjectOutputStream oop = new ObjectOutputStream(opt);
        oop.writeObject(st);

    }
}
