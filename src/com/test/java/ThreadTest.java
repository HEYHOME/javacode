package com.test.java;

/**
 * @author hey
 * @description
 * @create 2020-05-21-15:36
 */
public class ThreadTest extends Thread{
    ThreadTest(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(this.getName()+":"+i);
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {

            }
        }
        System.out.println(getName()+":完成!");
    }

    public static void main(String[] args) {
        new ThreadTest("线程1").start();
        new ThreadTest("线程2").start();
        new ThreadTest("线程3").start();
    }
}
