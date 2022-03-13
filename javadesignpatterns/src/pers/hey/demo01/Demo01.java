package pers.hey.demo01;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-08-21:09
 * @author: Hey
 */
public class Demo01 {
    private static int[] arr;
    private static int p=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        arr = new int[1000];

        dfs(n,m,1,0);
    }

    public static void dfs(int n,int m, int start,int sum) {
        if (m == sum) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
            return;
        }
        for (int i = start; i <=n ; i++) {
            sum+=i;
            arr[p++]=i;
            dfs(n,m,start+1,sum);
            p--;
            sum-=i;
        }

    }
}
