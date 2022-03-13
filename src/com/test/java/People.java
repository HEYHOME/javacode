package com.test.java;

/**
 * @author hey
 * @creat 2020-05-07-16:54
 */
public class People {
    String name;
    public People(){
        System.out.println("People1");

    }

    public People(String name) {
        System.out.println("People2:" + name);
        this.name=name;
    }
}

class Child extends People {
    People father;
    public Child(){
        System.out.println("Child1");
    }
    public Child(String name){
        System.out.println("Child2:" + name);
        this.name=name;
        father = new People(name+"F");
    }
}