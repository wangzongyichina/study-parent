package com.wzy.study.other.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 13:40
 * @Desc:
 */

public class FileCopyStreamTest01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // String str = "s/证券投资分析.pdf";
            // System.out.println(str.lastIndexOf("/"));
            // System.out.println(str.lastIndexOf("."));
            // System.out.println(str.length());
            // System.out.println(str.lastIndexOf("f"));
            // System.out.println(str.substring(str.lastIndexOf("/"),str.lastIndexOf(".")));
            // System.out.println(str.substring(str.lastIndexOf("s"),str.lastIndexOf("f")));
            // System.out.println(str.substring(str.lastIndexOf("s"),str.length()));
            // String str1 = "sdfg.pdf";
            // System.out.println(str1.substring(1, 2));

            long start = System.currentTimeMillis();
            String oldFilePath = "other/src/main/resources/证券投资分析.pdf";
            fis = new FileInputStream(oldFilePath);
            String suffix = oldFilePath.substring(oldFilePath.lastIndexOf(".") + 1);
            String name = oldFilePath.substring(oldFilePath.lastIndexOf("/") + 1, oldFilePath.lastIndexOf("."));
            fos = new FileOutputStream(
                oldFilePath.substring(0, oldFilePath.lastIndexOf("/") + 1) + "copy/" + name + "_copy." + suffix);
            byte[] bytes = new byte[100];
            int i;
            while ((i = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, i);
                fos.flush();
            }
            System.out.println("复制完成，耗时：" + (System.currentTimeMillis() - start));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }

    }
}
