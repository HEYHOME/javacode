package com.hey.demo01.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.IO.BufferedOutputStream extends OutputStream
 * 构造方法：
 * BufferedOutputStream(OutputStream out)
 * 创建一个新的缓冲输出流，以将数据写入指定的底层输出流
 * BufferedOutputStream(OutputStream out, int size)
 * 创建一个新的缓冲输出流，以便以指定的缓冲区大小将数据写入指定的底层输出流
 * OutputStream out:字节输出流
 * 我们可以传递FileOutputStream,缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutputStream对象效率
 * int size：指定缓冲流内部缓冲区的大小，不指定默认
 * 使用步骤：
 * 1.创建FileOutputStream对象，构造方法中绑定要输出的目的地
 * 2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream效率
 * 3.使用BufferedOutputStream对象中的方法write，把数据写入到内部缓冲区中
 * 4.使用BufferedOutputStream对象中的方法，把内部缓冲区中的数据，刷新到文件中
 * 5.释放资源（会先调用flush方法刷新数据，第四步可以省略）
 *
 * @author hey
 * @creat 2020-04-13-19:37
 */
public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream("1_IO\\a.txt");
        //2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream效率
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //3.使用BufferedOutputStream对象中的方法write，把数据写入到内部缓冲区中
        bos.write("我把数据写到内部缓冲区中".getBytes());
        //4.使用BufferedOutputStream对象中的方法，把内部缓冲区中的数据，刷新到文件中
        bos.flush();
        // 5.释放资源（会先调用flush方法刷新数据，第四步可以省略）
        bos.close();
    }
}

