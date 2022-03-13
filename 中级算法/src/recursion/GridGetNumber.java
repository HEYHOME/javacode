package recursion;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-04-16:25
 * @author: Hey
 */
public class GridGetNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] grid = new int[n+1][n+1];
        int[][][][] map = new int[n+1][n+1][n+1][n+1];
        while (true) {  //输入
            int x = in.nextInt();
            int y = in.nextInt();
            grid[x][y] = in.nextInt();
            if (x==0&&y==0&&grid[x][y]==0){  //输入一行0,结束输入
                break;
            }
        }
        GridGetNumber g = new GridGetNumber();
        g.gridGetNumber(grid,map,n);
    }

    public void gridGetNumber(int[][] grid,int[][][][] map,int n) {
        for (int x1 = 1; x1 <=n; x1++) {
            for (int y1 = 1; y1 <=n; y1++) {
                for (int x2 = 1; x2 <=n ; x2++) {
                    for (int y2 = 1; y2 <=n ; y2++) {
                        map[x1][y1][x2][y2]=
                                Math.max(Math.max(map[x1-1][y1][x2-1][y2],
                                        map[x1][y1-1][x2][y2-1]),
                                        Math.max(map[x1-1][y1][x2][y2-1],
                                                map[x1][y1-1][x2-1][y2]));
                        map[x1][y1][x2][y2]+=grid[x1][y1];
                        if (x1 != x2 && y1 != y2) {
                            map[x1][y1][x2][y2]+=grid[x2][y2];
                        }
                    }
                }
            }
        }
        System.out.println(map[n][n][n][n]);
    }
}
