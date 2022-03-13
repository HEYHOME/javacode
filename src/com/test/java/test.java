package com.test.java;

/**
 * @author hey
 * @creat 2020-05-07-17:08
 */
class Animal {
    public void shout(){
        System.out.println("动物叫!");
    }
}
class Cat extends Animal{
    public void shout(){
        super.shout();
        System.out.println("喵喵~~~");
    }
}
public class test{
    public static void main(String[] args) {
        Animal an = new Cat();
        an.shout();
    }
}
