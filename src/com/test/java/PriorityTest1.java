package com.test.java;

/**
 * @author hey
 * @description
 * @create 2020-05-21-16:24
 */
public class PriorityTest1 {
    public static void main(String[] args) {
        PriorityTest r = new PriorityTest();
        Thread t1 = new Thread(r,"线程1");
        t1.setPriority(Thread.NORM_PRIORITY-2);
        t1.start();
        Thread t2 = new Thread(r,"线程2");
        t2.setPriority(Thread.NORM_PRIORITY+2);
        t2.start();
    }
}
class PriorityTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
        System.out.println(Thread.currentThread().getName()+":完成!");
    }
}