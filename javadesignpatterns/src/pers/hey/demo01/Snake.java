package pers.hey.demo01;

import java.util.Scanner;

/**
 * @description: 蛇形矩阵(上三角形)
 * @create: 2020-10-01-17:29
 * @author: Hey
 */
public class Snake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, k = i; k >= 0; k--, j++) {
                arr[k][j] = x;
                x++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
