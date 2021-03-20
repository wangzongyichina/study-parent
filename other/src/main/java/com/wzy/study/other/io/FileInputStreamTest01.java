package com.wzy.study.other.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/14 16:43
 * @Desc:
 */

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        FileInputStream fis = null;
        try {
            // 文件路径:D:\temp\in\0314-test (ide 自动吧 \ 转义未 \\)
            // 文件路径也可以写成： D:/temp/in/0314-test
            fis = new FileInputStream("D:\\temp\\in\\0314-test");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.println(i);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fis != null) {
                try {
                    fis.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
