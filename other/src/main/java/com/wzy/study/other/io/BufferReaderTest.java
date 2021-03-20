package com.wzy.study.other.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 16:59
 * @Desc:
 */

public class BufferReaderTest {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\Study\\SpringBoot\\study-parent\\other\\src\\main\\java\\com\\wzy\\study\\other\\OtherApplication.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            String str = null;
            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
        }finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}
