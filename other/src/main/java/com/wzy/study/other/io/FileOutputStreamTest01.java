package com.wzy.study.other.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 13:29
 * @Desc:
 */

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //文件不存在，会创建文件
            //原文件存在内容， 会覆盖清空。如果要追加，使用 FileOutputStream(String name, boolean true)

            fos = new FileOutputStream("D:\\Study\\SpringBoot\\study-parent\\other\\src\\main\\resources\\OutTempfile1",true);
             byte[] bytes = {78, 97,98, 100};
            fos.write(bytes);
            fos.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
