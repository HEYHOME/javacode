package com.hey.demo01.BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * java.io.BufferedInputStream extends InputStream
 * 构造方法：
 *      BufferedInputStream(InputStream in)
 *      创建一个 BufferedInputStream并保存其参数，输入流 in ，供以后使用。
 *      BufferedInputStream(InputStream in, int size)
 *      创建 BufferedInputStream具有指定缓冲区大小，并保存其参数，输入流 in ，供以后使用
 *
 * @author hey
 * @creat 2020-04-13-20:14
 */
public class Demo02BufferedInputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("1_IO\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len =0;
        int count = 0;
        while ((len = bis.read())!=-1) {
            System.out.println(len);
            count++;
        }
        System.out.println(count);
        bis.close();
    }
}
