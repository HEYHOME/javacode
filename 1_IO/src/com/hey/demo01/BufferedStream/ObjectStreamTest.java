package com.hey.demo01.BufferedStream;

import java.io.*;

/**
 * @author hey
 * @description
 * @create 2020-06-19-16:46
 */
public class ObjectStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream ow = null;
        ObjectInputStream or = null;
        ow = new ObjectOutputStream(new FileOutputStream("1_IO\\a.txt"));
        or = new ObjectInputStream(new FileInputStream("1_IO\\a.txt"));
        ow.writeObject(new Account(111,"张三",3000));
        ow.writeObject(new Account(222,"李四",5000));
        for (int i = 0; i < 2; i++) {
            System.out.println(or.readObject());
        }
        or.close();
        ow.close();
    }
}

class Account implements Serializable {
    private long number;
    private String name;
    private double money;
    public Account(long number,String name,double money){
        super();
        this.number=number;
        this.name=name;
        this.money=money;
    }

    @Override
    public String toString() {
        String s = name+"的存折,账号="+number+",存款="+money;
        return s;
    }
}
