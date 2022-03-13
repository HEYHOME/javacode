package homework.week4;

import java.util.Scanner;

/**
 * @description: P1451 求细胞数量
 * @create: 2020-12-18-15:43
 * @author: Hey
 */
public class Luogu_1451 {
    static int[][] dirs = {{-1,0},{0,1},{1,0},{0,-1}};
    static char[][] grid;
    static int n,m;
    static int count=0;
    static boolean[][] marked;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new char[n][m];
        marked = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!marked[i][j] && grid[i][j] != '0') {
                    dfs(i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void dfs(int x,int y) {
        marked[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x+dirs[i][0];
            int newY = y+dirs[i][1];
            if (inArea(newX, newY) && !marked[newX][newY] && grid[newX][newY] != '0') {
                dfs(newX,newY);
            }
        }
    }

    public static boolean inArea(int x, int y) {
        return x>=0&&x<n&&y>=0&&y<m;
    }
}
