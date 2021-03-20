package com.wzy.study.other.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 15:45
 * @Desc:
 */

public class FileCopyReaderWriterTest01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            String oldFilePath = "other/src/main/resources/tempfile.txt";
            fr = new FileReader(oldFilePath);
            String suffix = oldFilePath.substring(oldFilePath.lastIndexOf("."));
            String filePath = oldFilePath.substring(0, oldFilePath.lastIndexOf("/") + 1);
            String name = oldFilePath.substring(oldFilePath.lastIndexOf("/") + 1, oldFilePath.lastIndexOf("."));
            String newFilePath = filePath + "copy"+name + "_copy" + suffix;
            fw = new FileWriter(newFilePath);
            char[] chars = new char[5];
            int count = 0;
            while ((count = fr.read(chars)) != -1) {
                System.out.println(new String(chars));
                fw.write(chars, 0, count);
                fw.flush();
            }
        }
        catch (Exception e) {
            System.out.println("产生异常啦");
        }
        finally {
            if (fr != null) {
                fr.close();
            }
            if (fw != null) {
                fw.close();
            }
        }

    }
}
