package com.queue;

import java.util.ArrayList;

/**
 * @author hey
 * @creat 2020-04-15-21:11
 */
public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        String str = list.get(0);
        System.out.println(str);
        System.out.println(list);
    }
}
