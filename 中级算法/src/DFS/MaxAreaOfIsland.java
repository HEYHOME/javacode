package DFS;

/**
 * @author hey
 * @description 岛屿的最大面积
 * 给定一个包含了一些 0 和 1 的非空二维数组 grid 。
 * 一个 岛屿 是由一些相邻的 1 (代表土地) 构成的组合，这里的「相邻」要求两个 1 必须
 * 在水平或者竖直方向上相邻。你可以假设 grid 的四个边缘都被 0（代表水）包围着。
 * 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为 0 。)
 *
 * 示例 1:
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *  [0,1,1,0,1,0,0,0,0,0,0,0,0],
 *  [0,1,0,0,1,1,0,0,1,0,1,0,0],
 *  [0,1,0,0,1,1,0,0,1,1,1,0,0],
 *  [0,0,0,0,0,0,0,0,0,0,1,0,0],
 *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *  [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * 对于上面这个给定矩阵应返回 6。注意答案不应该是 11 ，因为岛屿只能包含水平或垂直的四个方向的 1 。
 *
 * 示例 2:
 * [[0,0,0,0,0,0,0,0]]
 * 对于上面这个给定的矩阵, 返回 0。
 *
 * 注意: 给定的矩阵grid 的长度和宽度都不超过 50。
 *
 * @create 2020-07-03-23:02
 */
public class MaxAreaOfIsland {
    private static final int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};
    private boolean[][] marked;
    private int rows;
    private int cols;
    private int[][] grid;
    public int maxAreaOfIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        this.grid = grid;
        marked = new boolean[rows][cols];
        int ans=0;
        int temp = 0;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j]==0){
                    count++;
                }
            }
        }
        if (count == rows * cols) {
            return 0;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!marked[i][j]&&grid[i][j]==1){
                    temp = dfs(i,j);
                    if (temp > ans) {
                        ans = temp;
                    }
                }
            }
        }
        if (ans==0){
            return 0;
        }
        return ans+1;
    }

    private int dfs(int i, int j) {
        marked[i][j]=true;
        int count = 0;
        for (int k = 0; k < 4; k++) {
            int newX = i+directions[k][0];
            int newY = j+directions[k][1];
            if (inArea(newX, newY) && !marked[newX][newY] && grid[newX][newY] == 1) {
                count++;
                count+=dfs(newX,newY);
            }
        }
        return count;
    }

    private boolean inArea(int newX, int newY) {
        return newX>=0&&newX<rows&&newY>=0&&newY<cols;
    }
}
