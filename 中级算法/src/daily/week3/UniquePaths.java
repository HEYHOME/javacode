package daily.week3;

import java.util.Arrays;

/**
 * @description: 62. 不同路径
 * @create: 2020-12-09-22:15
 * @author: Hey
 */

/*
    动态规划
        dp[i][j]:指到达(i,j)的最多路径
        dp[i][j] = dp[i-1][j]+dp[i][j-1]
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] cur = new int[n];
        Arrays.fill(cur,1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                cur[j] += cur[j - 1];
            }
        }
        return cur[n - 1];
    }
}
