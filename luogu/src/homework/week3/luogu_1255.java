package homework.week3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @description: P1255 数楼梯
 * @create: 2020-12-06-11:25
 * @author: Hey
 */
public class luogu_1255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0){
            System.out.println("0");
            return;
        }
        BigInteger[] dp = new BigInteger[n+1];
        dp[0]= BigInteger.valueOf(1);
        dp[1]= BigInteger.valueOf(1);
        for (int i = 2; i <=n; i++) {
            dp[i] = dp[i-1].add(dp[i-2]);
        }
        System.out.println(dp[n]);
    }
}
