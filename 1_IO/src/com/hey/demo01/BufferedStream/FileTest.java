package com.hey.demo01.BufferedStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author hey
 * @description
 * @create 2020-06-19-16:05
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("1_IO\\a.txt");
        FileOutputStream out = new FileOutputStream("1_IO\\b.txt");
        int numRead = 0;
        byte[] buffer = new byte[512];
        while ((numRead = input.read(buffer)) != -1) {
            System.out.write(buffer,0,numRead);
        }
        out.write(buffer);
        out.flush();
        out.close();
        input.close();
    }
}
