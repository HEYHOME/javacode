package com.abc.hey.annotation.demo;

/**
 * @description: 计算器类
 * @create: 2020-12-03-10:02
 * @author: Hey
 */
public class Calculator {
    @Check
    public void add(){
        String s= null;
        s.toString();
        System.out.println("1+0="+(1+0));
    }
    @Check
    public void sub(){
        System.out.println("1-0="+(1-0));
    }
    @Check
    public void mul(){
        System.out.println("1*0="+(1*0));
    }
    @Check
    public void div(){
        System.out.println("1/0="+(1/0));
    }
    public void show(){
        System.out.println("无bug...");
    }
}
