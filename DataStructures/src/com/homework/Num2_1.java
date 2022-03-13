package com.homework;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-18-11:38
 * @author: Hey
 */
public class Num2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int maxNum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum);
    }
}
