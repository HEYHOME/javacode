package pers.hey.demo01;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-05-20:33
 * @author: Hey
 */
public class Jolly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            int j = i+1;
            if (Math.abs(arr[i] - arr[j]) < 1 || Math.abs(arr[i] - arr[j]) > n - 1) {
                System.out.println("Not Jolly");
                return;
            }
        }
        System.out.println("Jolly");
    }
}
