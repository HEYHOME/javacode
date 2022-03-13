package homework.week4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @description: P1141 01迷宫
 * @create: 2020-12-21-21:40
 * @author: Hey
 */

/*
    没AC
 */
public class Luogu_1141 {
    static int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static char[][] grid;
    static int[][] pos;
    static int count = 0;
    static int n, m;
    static boolean[][] marked;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new char[n+3][n+3];
        pos = new int[m+3][m+3];
        marked = new boolean[n+3][n+3];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                pos[i][j] = sc.nextInt();
            }
        }
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        for (int j = 0; j < m; j++) {
            int x = pos[j][0];
            int y = pos[j][1];
            x--;
            y--;
            qx.offer(x);
            qy.offer(y);
            marked[x][y] = true;
            count = 0;
            while (!qx.isEmpty()) {
                int dx = qx.poll();
                int dy = qy.poll();
                for (int i = 0; i < 4; i++) {
                    int newX = dx + dirs[i][0];
                    int newY = dy + dirs[i][1];
                    if (inArea(newX, newY) &&!marked[newX][newY]&&
                            ((grid[dx][dy] == '0' && grid[newX][newY] == '1') || (grid[dx][dy] == '1' && grid[newX][newY] == '0'))) {
                        count++;
                        marked[newX][newY] = true;
                        qx.offer(newX);
                        qy.offer(newY);
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    marked[i][k] = false;
                }
            }
            System.out.println(count+1);
        }
    }

    public static boolean inArea(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}
