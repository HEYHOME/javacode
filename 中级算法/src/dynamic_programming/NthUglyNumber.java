package dynamic_programming;

import java.util.Scanner;

/**
 * @description: 丑数
 * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。
 * 求按从小到大的顺序的第 n 个丑数
 * @create: 2020-11-28-21:49
 * @author: Hey
 */
public class NthUglyNumber {
    public static void main(String[] args) {
        NthUglyNumber nth = new NthUglyNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = nth.nthUglyNumber(n);
        System.out.println(res);
    }
    public int nthUglyNumber(int n) {
        int p2=0,p3=0,p5=0;
        int[] dp = new int[n];  // dp[i]表示第i+1个丑数
        dp[0]=1;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[p2]*2, Math.min(dp[p3]*3, dp[p5]*5));
            if (dp[i]==dp[p2]*2) p2++;
            if (dp[i]==dp[p3]*3) p3++;
            if (dp[i]==dp[p5]*5) p5++;
        }
        return dp[n-1];
    }
}
