package exercise1;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-12-27-14:46
 * @author: Hey
 */
public class NO7 {
    static int[][] dirs = {{-1,0},{0,1},{1,0},{0,-1}};
    static int n;
    static char[][] map;
    static boolean[][] marked;
    static int count1=0;
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new char[n][n];
        marked = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                map[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'A'&&!marked[i][j]) {
                    marked[i][j]=true;
                    count++;
                    dfs(i,j);
                }
            }
        }
        System.out.println(count-count1);
    }

    private static void dfs(int i, int j) {
        for (int k = 0; k < 4; k++) {
            int newX = i+dirs[k][0];
            int newY = j+dirs[k][1];
            if (inArea(newX, newY) && !marked[newX][newY] && map[newX][newY] == 'A') {
                if (k==3){
                    count1++;
                }
                marked[newX][newY] = true;
                dfs(newX,newY);
            }
        }
    }

    private static boolean inArea(int x, int y) {
        return x>=0&&x<n&&y>=0&&y<n;
    }
}
