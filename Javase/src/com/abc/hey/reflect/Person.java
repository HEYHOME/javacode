package com.abc.hey.reflect;

/**
 * @description:
 * @create: 2020-11-29-16:09
 * @author: Hey
 */
public class Person {
    public String name;
    protected int age;
    String address;
    private int number;
    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("eat...");
    }
    public void eat(String food){
        System.out.println("eat "+food);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }
}
