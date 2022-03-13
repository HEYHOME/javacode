package DFS;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description: 零钱兑换
 * 给定不同面额的硬币 coins 和一个总金额
 * amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 * 示例 1:
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 *
 * 示例 2:
 * 输入: coins = [2], amount = 3
 * 输出: -1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/coin-change
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create: 2020-09-05-14:00 (1.2020-10-02-19:14)
 * @author: Hey
 *
 */
public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        CoinChange test = new CoinChange();
        int res = test.coinChange(coins,amount);
        System.out.println(res);
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1]; //dp[i]表示凑成总金额为i所需要的最少的硬币个数
        Arrays.fill(dp,amount+1);  //最多的硬币数就是全部使用面值为1的硬币兑换
        dp[0]=0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i-coin<0){
                    continue;
                }
                dp[i] = Math.min(dp[i],1+dp[i-coin]);
            }
        }
        return (dp[amount]==amount+1)?-1:dp[amount];
    }
}
