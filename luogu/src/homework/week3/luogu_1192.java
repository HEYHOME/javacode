package homework.week3;

import java.util.Scanner;

/**
 * @description: P1192 台阶问题
 * @create: 2020-12-08-21:14
 * @author: Hey
 */
public class luogu_1192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <=k ; j++) {
                if (i>=j){
                    dp[i] = (dp[i]+dp[i-j])%100003;
                }
            }
        }
        System.out.println(dp[n]);
    }
}
