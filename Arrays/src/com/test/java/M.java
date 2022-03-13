package com.test.java;

import java.util.Scanner;

/**
 * @author hey
 * @creat 2020-04-25-12:28
 */
public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] e = new int[1024][];
        int i = 0, j = 0;
        int count = 0;
        int[] a = new int[100];
        int k = 0;
        while ((e[i][j] = sc.nextInt()) != -1) {
            for (i = 0; i < e.length; i++) {
                for (j = 0; j < 2; j++) {
                    a[k++] = e[i][j];
                    int p=0,q=1;
                    while(q<a.length) {
                        for (int i1 = 0; i1 < a.length; i1++) {
                            if (a[p] == a[q]) {
                                count++;
                                p++;
                            }
                            q++;
                        }
                    }
                }
            }
        }


    }
}
