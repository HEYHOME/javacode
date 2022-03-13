package com.hey.demo01.BufferedStream;

import java.io.File;

/**
 * @author hey
 * @description
 * @create 2020-06-19-16:58
 */
public class FileTest02 {
    public static void main(String[] args) {
        File f = new File("1_IO\\c.txt");
        System.out.println("文件是否存在:"+f.exists());
        System.out.println("文件是否是可隐藏文件:"+f.isHidden());
        System.out.println("文件的绝对路径:"+f.getAbsolutePath());
        System.out.println("文件对象的名称:"+f);
        System.out.println("文件所在的路径:"+f.getPath());
    }
}
