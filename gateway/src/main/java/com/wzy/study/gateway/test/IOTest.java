package com.wzy.study.gateway.test;

import com.google.common.io.ByteStreams;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/23 20:41
 * @Desc:
 */

public class IOTest {

    @Test
    public void test01() throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\temp\\in/test01.jpg");

        byte[] bytes = ByteStreams.toByteArray(inputStream);

        System.out.println("bytes.length = " + bytes.length);
        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(bytes);
        System.out.println("arrayInputStream.available() = " + arrayInputStream.available());
        System.out.println("bytes.length2 = " + bytes.length);


    }

}
