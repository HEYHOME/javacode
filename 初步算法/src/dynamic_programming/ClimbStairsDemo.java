package dynamic_programming;

/**
 * @author hey
 * @description
 *     爬楼梯:
 *      假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *      每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @create 2020-05-14-15:46
 */

/*
    爬上 n-1n−1 阶楼梯的方法数量。因为再爬1阶就能到第n阶
    爬上 n-2n−2 阶楼梯的方法数量，因为再爬2阶就能到第n阶
    所以我们得到公式 dp[n] = dp[n-1] + dp[n-2]dp[n]=dp[n−1]+dp[n−2]
    同时需要初始化 dp[0]=1,dp[1]=1
    时间复杂度：O(n)O(n)

 */
public class ClimbStairsDemo {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
