package com.test.java;

import java.util.Scanner;

/**
 * @author hey
 * @creat 2020-04-25-10:28
 */
public class G {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        int value;
        int cnt=0;
        // int[] value=new int[n];
        for (int i = 0; i < n; i++) {
            value=sc.nextInt();
            a[i]=value;
        }
        int p=0,q=1;
        int[] b=new int[n];
        for (int i = 0; i < a.length; i++) {
            if (a[p]==a[q]) {
                cnt++;

                p++;
            }
            q++;
        }
    }
}
