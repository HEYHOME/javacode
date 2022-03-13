package com.hey.demo01.BufferedStream;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author hey
 * @description
 * @create 2020-06-19-17:04
 */
public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("1_IO\\test.dat", "rw");
        rf.seek(rf.length());
        rf.writeChars("hello world!\n");
        rf.writeBoolean(true);
        rf.writeChar('a');
        rf.writeChar('b');
        rf.writeDouble(3.1415926535);
        rf.seek(rf.length()-12);
        System.out.println(rf.readChar());
        rf.skipBytes(2);
        System.out.println(rf.readDouble());
        rf.seek(rf.length()-13);
        System.out.println(rf.readBoolean());
        rf.seek(rf.length()-26);
        System.out.println(rf.readLine());
        rf.close();
    }
}
