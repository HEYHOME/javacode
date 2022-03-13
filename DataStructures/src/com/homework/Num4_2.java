package com.homework;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-11-01-21:26
 * @author: Hey
 */
public class Num4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] arr = new int[x+1][y+1];
        int t=1;
        int k;
        boolean flag=false;
        boolean mark = false;
        // 输入
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[1].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 1; i < arr.length; i++) {  // 找到每一行的最小值
            for (int j = 1; j <arr[1].length; j++) {
                if (arr[i][t] > arr[i][j]) {
                    t=j;
                }
            }
            for ( k = 1; k < arr.length; k++) {  // 判断每一行的最小值是否在其所在列是最大值
                if (arr[i][t] < arr[k][t]) {
                    break;
                }
            }
            if (k == arr.length) {// 找到
                if (mark) {
                    System.out.println();
                }
                mark = true;

                flag = true;
                System.out.print(i+" "+t);
            }
            t=1;
        }

        if (!flag) {
            System.out.print("NO");
        }
    }
}
