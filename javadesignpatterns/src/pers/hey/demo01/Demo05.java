package pers.hey.demo01;

/**
 * @description:
 * @create: 2020-10-10-10:13
 * @author: Hey
 */
public class Demo05 {
    private static int res=0; // 共有多少种放法
    public static void main(String[] args) {
        int[][] map = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                dfs(map, i, j, 0);
            }
        }
        System.out.println(res);
    }

    private static void dfs(int[][] map, int i, int j, int count) {
        // 皇后数为8时,返回.
        if (count == 8) {
            res++;
            return;
        }

        map[i][j] = 1;
        // 标记以该皇后为中心得每一横,列,斜列为1.
        for (int k = 0; k < 8; k++) {
            map[i][k] = 1;
            map[k][j] = 1;
            if (i > 0 && i < 7 && j > 0 && j < 7) {
                map[i - 1][j + 1] = 1;
                map[i - 1][j - 1] = 1;
                map[i + 1][j - 1] = 1;
                map[i + 1][j + 1] = 1;
            }
        }
        // 标记后,遍历map,若出现未标记的,放一个皇后.
        for (int i1 = 0; i1 < 8; i1++) {
            for (int j1 = 0; j1 < 8; j1++) {
                if (map[i1][j1] == 0) {
                    dfs(map,i1,j1,count+1);
                    map[i1][j1]=0;
                }
            }

        }
    }
}
