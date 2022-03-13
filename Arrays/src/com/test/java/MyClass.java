package com.test.java;

import java.util.Scanner;

/**
 * @author hey
 * @creat 2020-04-25-8:30
 */
public class MyClass {
    public static void main(String[] args) {
        int[] date = new int[8];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < date.length; i++) {
            date[i] = sc.nextInt();
        }
        String[] s = sc.nextLine().split("");
        Solution1 sl = new Solution1();
        String ans=sl.str(date,s);
        System.out.println(ans);
    }
}

class Solution1 {
    public String str(int[] date,String[] string) {

        if (date[0] * 1000 + date[1] * 100 + date[2] * 10 + date[3] < 1900 && date[0] * 1000 + date[1] * 100 + date[2] * 10 + date[3] > 2020 && date[4] * 10 + date[5] < 1 && date[4] * 10 + date[5] > 12) {
            return "none";

        }
        int k = 0;
        // boolean flag = false;
        int[] a = new int[2];
        for (int i = 0; i < date.length; i++) {
            k += date[i];

        }
        while (k >= 10) {
            a[0] = k / 10;
            a[1] = k % 10;
            k = a[0] + a[1];
        }
        for (int i = 0; i < string.length; i++) {
            string[i] = string[i] + k;
            if(string[i]==" "){
                string[i]="#";
            }
        }
        return string.toString();
    }
}