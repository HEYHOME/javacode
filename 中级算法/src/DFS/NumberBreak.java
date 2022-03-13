package DFS;

import java.util.Scanner;

/**
 * @description: 整数分解
 * @create: 2020-10-07-23:20
 * @author: Hey
 */
public class NumberBreak {
    private static int[] arr;
    private static int p=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n];
        dfs(n,1);
    }

    private static void dfs(int n, int start) {
        if (n <= 0) {
            for (int i = 0; i < p; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        for (int i = start; i <= n; i++) {
            arr[p] = i;
            p++;
            dfs(n-i,i);
            p--;
        }
    }
}
