package com.test.java;

/**
 * @author hey
 * @description
 * @create 2020-05-21-16:36
 */
public class SynchronizedTest implements Runnable{
    private static Bank bank;

    SynchronizedTest(Bank bank) {
        this.bank=bank;
    }
    public void run(){
        for (int i = 0; i < 3; i++) {
            bank.save(100);
        }
    }

    public static void main(String[] args) {
        bank = new Bank();
        SynchronizedTest s = new SynchronizedTest(bank);
        Thread thread1 = new Thread(s);
        thread1.start();
        Thread thread2 = new Thread(s);
        thread2.start();
    }
}
class Bank{
    private int money = 0;

    public synchronized void save(int money) {
        int temp= this.money;
        temp+=money;
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.money=temp;
        String n = Thread.currentThread().getName();
        System.out.println(n+":存入"+money+"元,账户余额为:"+this.money);
    }
}
