package homework.week3;

import java.util.Scanner;

/**
 * @description: P1025 数的划分
 * @create: 2020-12-08-22:04
 * @author: Hey
 */
public class luogu_1025 {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        dfs(n,k,0,1);
        System.out.println(count);
    }
    private static void dfs(int n,int k, int sum,int start) {
        if (k==0){
            if (sum==n){
                count++;
            }
            return;
        }
        int end = n-sum;
        for (int i = start; i <=end ; i++) {
            dfs(n,k-1,sum+i,i);
        }
    }
}
