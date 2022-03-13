package com.homework;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-30-19:03
 * @author: Hey
 */
public class Num4_1 {
    public static void main(String[] args) {
        int[] num = new int[36];
        char x;
        boolean marked = false;
        boolean flag1 = false;
        boolean flag2 = false;
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num[c - '0']++;
            } else if (c >= 'a' && c <= 'z') {
                num[c - 'a' + 10]++;
            }
        }

        for (int i = 10; i <= 35; i++) {
            x = (char) (i + 87);
            if (num[i] != 0) {
                if (marked) {
                    System.out.println();
                }
                System.out.printf("%c %d",x,num[i]);
                marked = true;
            }
        }

        for (int i = 0; i <=35 ; i++) {
            if (i < 10 && num[i] != 0) {
                flag1=true;
            }
            if (i >= 10 && num[i] != 0) {
                flag2 = true;
            }
        }
        if (flag1 && flag2) {
            System.out.println();
        }

        marked = false;
        for (int i = 0; i < 10; i++) {
            if (num[i] != 0) {
                if (marked) {
                    System.out.println();
                }
                System.out.printf("%d %d",i,num[i]);
                marked = true;
            }
        }
    }
}
