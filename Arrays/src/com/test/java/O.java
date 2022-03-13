package com.test.java;

import java.util.Scanner;

/**
 * @author hey
 * @creat 2020-04-25-11:55
 */
public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int b=a[0]*a[1];
        int c=a[0];
        for (int i = 1; i < a.length-1; i++) {
            c+=a[i];
            b+=c*a[i+1];
        }
        System.out.println(b);
    }
}
