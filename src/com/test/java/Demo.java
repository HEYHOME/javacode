package com.test.java;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-12-03-21:09
 * @author: Hey
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=1;
        int a=1,b=1;
        for (int i = 1; i <= n; i++) {
            a*=i;
            b*=2*i+1;
            sum+=a/b;
            System.out.println(a+"/"+b);
        }
    }
}
