package homework.week1;

import java.util.Scanner;

/**
 * @description: P2670 扫雷游戏
 * @create: 2020-12-02-21:25
 * @author: Hey
 */
public class luogu_2670 {
    private static char[][] chars;
    private static int n;
    private static int m;
    private static int[][] dirs={{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0, -1},{-1,-1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         chars = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                chars[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (chars[i][j] != '*') {
                    // 统计该点周围有多少个地雷
                    String ss = countLandmine(i,j)+"";
                    chars[i][j] = ss.charAt(0);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }

    public static int countLandmine(int i, int j) {
        int count=0;
        for (int k = 0; k < 8; k++) {
            int newX = i+dirs[k][0];
            int newY = j+dirs[k][1];
            if (isArea(newX,newY)&&chars[newX][newY]=='*'){
                count++;
            }
        }
        return count;
    }
    public static boolean isArea(int x,int y){
        if (x>=0&&x<=n-1&&y>=0&&y<=m-1){
            return true;
        }
        return false;
    }
}
