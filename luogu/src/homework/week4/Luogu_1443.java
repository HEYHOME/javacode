package homework.week4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @description: P1443 马的遍历
 * @create: 2020-12-16-14:54
 * @author: Hey
 */

/*
    使用bfs
    遍历当前马所在位置可以到达的所有位置,使用队列存储每一个遍历到的位置.
 */
public class Luogu_1443 {
    static int[][] dirs = {{-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2,
            -1}, {-1, -2}, {1, -2}};
    static int n, m, x, y;
    static int[][] arr;
    static Queue<Integer> qx = new LinkedList<>();
    static Queue<Integer> qy = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        arr = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(arr[i],-1);
        }
        bfs();
    }

    public static void bfs() {
        arr[x][y] = 0;
        qx.add(x);
        qy.add(y);
        while (qx.size() > 0) {
            int x0 = qx.poll();
            int y0 = qy.poll();
            for (int i = 0; i < 8; i++) {
                int newX = x0 + dirs[i][0];
                int newY = y0 + dirs[i][1];
                if (isArea(newX, newY) && arr[newX][newY] == -1) {
                    arr[newX][newY] = arr[x0][y0] + 1;
                    qx.add(newX);
                    qy.add(newY);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.printf("%-5d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isArea(int x, int y) {
        return x >= 1 && x <= n && y >= 1 && y <= m;
    }
}
