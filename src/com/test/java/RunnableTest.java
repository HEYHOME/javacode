package com.test.java;

/**
 * @author hey
 * @description
 * @create 2020-05-21-15:48
 */
public class RunnableTest implements Runnable {
    public void run(){
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep((int)(Math.random()*1000));
            }catch (InterruptedException e){}
        }
        System.out.println(Thread.currentThread().getName()+":完成!");
    }

    public static void main(String[] args) {
        RunnableTest  r= new RunnableTest();
        new Thread(r,"线程1").start();
        new Thread(r,"线程2").start();
        new Thread(r,"线程3").start();
    }
}
