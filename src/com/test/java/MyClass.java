package com.test.java;

/**
 * @author hey
 * @creat 2020-05-06-20:35
 */
public class MyClass {
    private final int A = 100;
    public static final int B = 200;
    private final int C;
    public MyClass(int x){
        C=x;
    }
    public static void main(String[] args) {
        MyClass my = new MyClass(20);
        System.out.println("my.A:" + my.A);
        System.out.println("my.B:" + my.B);
        System.out.println("my.C:"+my.C);
    }
}
