package com.test.java;

import java.util.Scanner;

/**
 * @author hey
 * @creat 2020-04-25-9:15
 */
public class B {
    public static void main(String[] args) {
        int[] month = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        while (true) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            int monthDay=0, week, day;
            for (int i = 1; i < m; i++) {
                monthDay += month[i];
            }
            y = y - 2000;
            d = d - 1;
            d = d + y * 365;
            d += monthDay;
            week = d / 4+1;
            day = d-week*4;
            System.out.println(d);
            System.out.println(week + " " + day);
        }
    }
}
