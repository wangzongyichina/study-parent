package com.wzy.study.other.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 13:05
 * @Desc:
 */

public class FileInputStreamTest03 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("other/src/main/resources/tempfile2");
             FileInputStream fis2 = new FileInputStream("C:\\Users\\wangzongyi\\Desktop/头像.jpg")) {
            int available = fis.available();
            System.out.println("available = " + available);
             int size = fis2.available();
            System.out.println("size = " + size);

            final long skip = fis.skip(1);
            System.out.println("skip = " + skip);


        }
    }
}
