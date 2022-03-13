package pers.hey.demo01;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-10-9:48
 * @author: Hey
 */
public class Demo03 {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int res = dfs(arr,n);
        System.out.println(res);
    }

    public static int dfs(int[] arr,int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return dfs(arr,n-1)+dfs(arr,n-2);
    }
}
