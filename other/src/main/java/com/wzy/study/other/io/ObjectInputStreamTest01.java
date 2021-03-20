package com.wzy.study.other.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 19:59
 * @Desc:
 */

public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("other/src/main/resources/student"));
        Object o = ois.readObject();
        System.out.println("o = " + o);
    }
}

