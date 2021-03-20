package com.wzy.study.other.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/14 17:44
 * @Desc:
 */

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // idea 默认的当前路径是 工程project的根。
            // fis = new FileInputStream("tempfile");
            fis = new FileInputStream("other/src/main/resources/tempfile1");

            // 通过byte[]数组，一次读取数组.lenth 的长度
            byte[] bytes = new byte[4];
            int count;
            String st = "";
            while ((count = fis.read(bytes)) != -1) {

                st = st + new String(bytes, 0, count);
            }
            System.out.println(st);
            // int i = fis.read(bytes);
            // System.out.println("i = " + i);
            // i = fis.read(bytes);
            // System.out.println("i = " + i);
            // i = fis.read(bytes);
            // System.out.println("i = " + i);
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
