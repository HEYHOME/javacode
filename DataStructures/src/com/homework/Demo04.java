package com.homework;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-24-17:19
 * @author: Hey
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i)-'0';
            System.out.println(num);
        }
    }
}
