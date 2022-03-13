package homework.week4;

import java.util.Scanner;

/**
 * @description: P1605 迷宫
 * @create: 2020-12-13-9:18
 * @author: Hey
 */
public class Luogu_1605 {
    static int count = 0;
    static int n;
    static int m;
    static int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};//近同远反
    static int[][] grid;
    static int fx, fy;
    static boolean[][] marked;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int t = sc.nextInt();
        grid = new int[n+1][m+1];
        marked = new boolean[n+1][m+1];
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        fx = sc.nextInt();
        fy = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            grid[x][y] = 1;
        }
        dfs(sx, sy);
        System.out.println(count);
    }

    private static void dfs(int a, int b) {
        marked[a][b] = true;
        if (a == fx && b == fy) {
            count++;
            marked[a][b] = false;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int newX = a + dirs[i][0];
            int newY = b + dirs[i][1];
            if (isArea(newX, newY)&&!marked[newX][newY] && grid[newX][newY] == 0) {
                marked[newX][newY] = true;
                dfs(newX, newY);
                marked[newX][newY] = false;
            }
        }
    }

    public static boolean isArea(int a, int b) {
        return (a >= 1 && a <= n && b >= 1 && b <= m);
    }
}
