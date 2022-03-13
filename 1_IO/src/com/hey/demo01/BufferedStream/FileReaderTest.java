package com.hey.demo01.BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author hey
 * @description
 * @create 2020-06-19-16:32
 */
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        String string;
        FileReader reader = new FileReader("1_IO\\a.txt");
        FileWriter writer = new FileWriter("1_IO\\b.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        while ((string = bufferedReader.readLine()) != null) {
            writer.write(string,0,string.length());
        }
        System.out.println("文件拷贝成功");
        reader.close();
        writer.close();
        bufferedReader.close();
    }
}
