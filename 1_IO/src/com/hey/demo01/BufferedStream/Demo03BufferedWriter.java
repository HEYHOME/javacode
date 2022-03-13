package com.hey.demo01.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * java.io.BufferedWriter extends Writer
 * 构造方法：
 *      BufferedWriter(Writer out)
 *      创建使用默认大小的输出缓冲区的缓冲字符输出流。
 *      BufferedWriter(Writer out, int sz)
 *      创建一个新的缓冲字符输出流，使用给定大小的输出缓冲区。
 * 特有的成员方法：
 *      void newLine()  写一行行分隔符，会根据不同的操作系统获取不同的行分隔符
 * @author hey
 * @creat 2020-04-13-20:57
 */
public class Demo03BufferedWriter {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("1_IO\\a.txt"));
        for (int i = 0; i <10 ; i++) {
            bw.write("hello");
            // bw.write("\r\n");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
