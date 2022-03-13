package com.test.java;

import java.util.Scanner;

/**
 * @author hey
 * @creat 2020-04-25-11:27
 */
public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] lbr=new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                lbr[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for (int i = 0; i < lbr.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (lbr[i][j]==1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println("\n");
    }
}
