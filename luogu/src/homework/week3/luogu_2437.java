package homework.week3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @description: P2437 蜜蜂路线
 * @create: 2020-12-08-20:53
 * @author: Hey
 */
public class luogu_2437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        BigInteger[] dp = new BigInteger[n+1];
        dp[m] = BigInteger.ONE;
        dp[m+1] = BigInteger.ONE;
        for (int i = m+2; i <=n ; i++) {
            dp[i] = dp[i-1].add(dp[i-2]);
        }
        System.out.println(dp[n]);

    }
}
