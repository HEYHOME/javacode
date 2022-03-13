package com.hey.demo01.BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * java.io.BufferedReader extends Reader
 * 构造方法：
 *      BufferedReader(Reader in)
 *      创建使用默认大小的输入缓冲区的缓冲字符输入流。
 *      BufferedReader(Reader in, int sz)
 *      创建使用指定大小的输入缓冲区的缓冲字符输入流
 * 特有的成员方法：
 *      String	readLine()  读一行文字,一行被视为由换行符（'\ n'），回车符（'\ r'）中的任何一个或随后的换行符终止
 *      返回值：包含行的内容的字符串，不包括任何行终止字符，如果已达到流的末尾，则为null
 * @author hey
 * @creat 2020-04-13-21:09
 */
public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("1_IO\\a.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            

        }
        br.close();
    }
}
