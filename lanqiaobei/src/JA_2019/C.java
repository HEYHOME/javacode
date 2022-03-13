package JA_2019;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @description: 试题C: 迷宫
 * 下图给出了一个迷宫的平面图，其中标记为 1 的为障碍，标记为 0 的为可 以通行的地方。
 * 010000
 * 000100
 * 001001
 * 110000
 * 迷宫的入口为左上角，出口为右下角，在迷宫中，只能从一个位置走到这 个它的上、下、左、右四个方向之一。
 * 对于上面的迷宫，从入口开始，可以按DRRURRDDDR 的顺序通过迷宫， 一共 10 步。其中 D、U、L、R 分别表示向下、向上、向左、向右走。
 * 对于下面这个更复杂的迷宫（30 行 50 列），请找出一种通过迷宫的方式， 其使用的步数最少，在步数最少的前提下，请找出字典序最小的一个作为答案。
 * 请注意在字典序中D<L<R<U。
 * @create: 2020-07-16-19:43
 * @author: Hey
 */
public class C {
    static class Pair {
        int row;
        int col;

        public Pair(int x, int y) {
            row = x;
            col = y;
        }
    }

    static char[] dir = {'D', 'L', 'R', 'U'};
    static String[] g = new String[30];
    static int[][] dist = new int[30][50];
    // 坐标向量: 下,左,右,上
    static int[] dx = new int[]{1, 0, 0, -1};
    static int[] dy = new int[]{0, -1, 1, 0};

    public static void bfs() {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(29, 49));
        while (!q.isEmpty()) {
            Pair t = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = t.row + dx[i];
                int y = t.col + dy[i];
                if (x >= 0 && x < 30 && y >= 0 && y < 50 && dist[x][y] == -1 && g[x].charAt(y) == '0') {
                    dist[x][y] = dist[t.row][t.col] + 1;
                    q.add(new Pair(x, y));
                }
            }
        }
    }

    public static void main(String[] args) {
        // long start = System.currentTimeMillis();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            g[i] = in.nextLine();
        }
        String res = "";
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[0].length; j++) {
                dist[i][j] = -1;// -1表示未访问过
            }
        }
        dist[29][49] = 0;
        bfs();
        int x = 0;
        int y = 0;
        while (x != 29 || y != 49) {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < 30 && ny >= 0 && ny < 50 && g[nx].charAt(ny) == '0') {
                    if (dist[x][y] == 1 + dist[nx][ny]) {
                        x = nx;
                        y = ny;
                        res += dir[i];
                        break;
                    }
                }
            }
        }
        // long now = System.currentTimeMillis();
        // double time = (now-start)/1000.0;
        // System.out.println(time);
        System.out.println(res);  // DDDDRRURRRRRRDRRRRDDDLDDRDDDDDDDDDDDDRDDRRR
        // URRUURRDDDDRDRRRRRRDRRURRDDDRRRRUURUUUUUUULULLUUUURRRRUULLLUUUULLUUUL
        // UURRURRURURRRDDRRRRRDDRRDDLLLDDRRDDRDDLDDDLLDDLLLDLDDDLDDRRRRRRRRRDDDDDDRR
    }
}
