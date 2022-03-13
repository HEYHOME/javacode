package homework.week4;

import java.util.Scanner;

/**
 * @description: P1162 填涂颜色
 * @create: 2020-12-19-13:04
 * @author: Hey
 */
public class Luogu_1162 {
    static int[][] dirs={{-1,0},{0,1},{1,0},{0,-1}};
    static boolean[][] marked;
    static int[][] grid;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        grid = new int[n+2][n+2];
        marked = new boolean[n+2][n+2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        dfs(0,0);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (!marked[i][j] && grid[i][j] == 0) {
                    System.out.print(2+" ");
                }else{
                    System.out.print(grid[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    private static void dfs(int i, int j) {
        for (int k = 0; k < 4; k++) {
            int newX = i+dirs[k][0];
            int newY = j+dirs[k][1];
            if (inArea(newX, newY) && !marked[newX][newY] && grid[newX][newY] == 0) {
                marked[newX][newY]=true;
                dfs(newX, newY);
            }
        }
    }

    private static boolean inArea(int x, int y) {
        return x>=0&&x<=n+1&&y>=0&&y<=n+1;
    }
}
