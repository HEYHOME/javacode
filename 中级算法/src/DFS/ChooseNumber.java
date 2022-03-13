package DFS;

import java.util.Scanner;

/**
 * @description: 选数
 * 从nn个整数中任选kk个整数相加，可分别得到一系列的和.
 * 例如当n=4,k=3n=4,k=3,44个整数分别为3,7,12,193,7,12,19时，可得全部的组合与它们的和为：
 *
 * 3+7+12=22
 * 3+7+12=22
 * 3+7+19=29
 * 3+7+19=29
 * 7+12+19=38
 * 7+12+19=38
 * 3+12+19=34
 * 3+12+19=34。
 *
 * 现在，要求你计算出和为素数共有多少种。
 * 例如上例，只有一种的和为素数：3+7+19=293+7+19=29。
 * @create: 2020-10-05-23:50
 * @author: Hey
 */
public class ChooseNumber {
    public static int k, n;
    public static int count = 0;
    public static int[] a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        a = new int[25];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        dfs(0, 0, 0);
        System.out.println(count);
    }

    private static void dfs(int m, int sum, int start) {
        // m:当前选了多少个数,sum:当前的和,start:升序排列,以免重复
        if (m == k) {
            if (isPrime(sum)) {
                count++;
            }
            return;
        }
        for (int i = start; i < n; i++) {
            dfs(m + 1, sum + a[i], i + 1);
        }
    }

    private static boolean isPrime(int sum) {
        if (sum == 1) {
            return false;
        } else {
            for (int i = 2; i * i <= sum; i++) {
                if (sum % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
