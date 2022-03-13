package dynamic_programming;

/**
 * @description: 不同路径 II
 * @create: 2020-11-24-19:22
 * @author: Hey
 */

/**
 * 动态规划分为两类:求最优解和求计数
 *
 * 因为「机器人每次只能向下或者向右移动一步」，所以从坐标 (0, 0)(0,0) 到坐标 (i, j)(i,j) 的路径总数的值只取决于从坐标 (0,
 * 0)(0,0) 到坐标 (i - 1, j)(i−1,j) 的路径总数和从坐标 (0, 0)(0,0) 到坐标 (i, j - 1)(i,j−1)
 * 的路径总数，即 f(i, j)f(i,j) 只能通过 f(i - 1, j)f(i−1,j) 和 f(i, j - 1)f(i,j−1) 转移得到
 *
 * 由于这里 f(i, j)f(i,j) 只与 f(i - 1, j)f(i−1,j) 和 f(i, j - 1)f(i,j−1)
 * 相关，我们可以运用「滚动数组思想」把空间复杂度优化称 O(m)O(m)
 * 。「滚动数组思想」是一种常见的动态规划优化方法，在我们的题目中已经多次使用到，例如「剑指 Offer 46. 把数字翻译成字符串」、「70.
 * 爬楼梯」等，当我们定义的状态在动态规划的转移方程中只和某几个状态相关的时候，就可以考虑这种优化方法，目的是给空间复杂度「降维」
 *
 *
 */
public class UniquePathsWithObstacles {
    public static void main(String[] args) {
        int[][] obstacleGrid = {
                {0,0,0},
                {0,0,1},
                {1,0,0}
        };
        UniquePathsWithObstacles u = new UniquePathsWithObstacles();
        int ans = u.uniquePathsWithObstacles(obstacleGrid);
        System.out.println(ans);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[] dp = new int[cols];

        dp[0] = obstacleGrid[0][0] == 0 ?1:0;
        for (int i = 0;i<rows;i++){
            for (int j = 0; j < cols; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                    continue;
                }
                if (j - 1 >= 0 && obstacleGrid[i][j - 1] == 0) {
                    dp[j]+=dp[j-1];
                }
            }
        }
        return dp[cols - 1];
    }
}
