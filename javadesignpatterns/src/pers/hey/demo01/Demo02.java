package pers.hey.demo01;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-10-9:35
 * @author: Hey
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
