package dynamic_programming;

/**
 * @author hey
 * @description 买股票的最佳时机:
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 * 注意：你不能在买入股票前卖出股票。
 * @create 2020-05-14-16:17
 */
public class MaxProfitDemo {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] - prices[i] > max_profit) {
                    max_profit = prices[j] - prices[i];
                }
            }
        }
        return max_profit;
    }
}
