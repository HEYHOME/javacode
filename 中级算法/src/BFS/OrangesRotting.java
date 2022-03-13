package BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 994. 腐烂的橘子
 * @create: 2020-12-04-20:39
 * @author: Hey
 */
public class OrangesRotting {
    public static void main(String[] args) {
        OrangesRotting or = new OrangesRotting();
        int[][] grid = {{1,1,2,0,2,0}};
        int res = or.orangesRotting(grid);
        System.out.println(res);
    }
   public int orangesRotting(int[][] grid){
       int rows = grid.length;
       int cols = grid[0].length;
       Queue<int[]> queue = new LinkedList<>();
       int count=0;  //表示新鲜橘子的数量
       for (int r = 0; r < rows; r++) {
           for (int c = 0; c < cols; c++) {
               if (grid[r][c] == 1) {
                   count++;
               }else if (grid[r][c]==2){
                   queue.add(new int[]{r,c});
               }
           }
       }

       int round=0; // round 表示腐烂的轮数，或者分钟数
       while (count > 0 && !queue.isEmpty()) {
           round++;
           int n = queue.size();
           for (int i = 0; i < n; i++) {
               int[] orange = queue.poll();
               int r = orange[0];
               int c = orange[1];
               if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                   count--;
                   grid[r-1][c]=2;
                   queue.add(new int[]{r-1,c});
               }
               if (c + 1 < cols && grid[r][c + 1] == 1) {
                   count--;
                   grid[r][c+1]=2;
                   queue.add(new int[]{r,c+1});
               }
               if (r + 1 < rows && grid[r + 1][c] == 1) {
                   count--;
                   grid[r+1][c]=2;
                   queue.add(new int[]{r+1,c});
               }
               if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                   count--;
                   grid[r][c-1]=2;
                   queue.add(new int[]{r, c - 1});
               }
           }
       }
       if (count > 0) {
           return -1;
       }
       return round;
   }
}
