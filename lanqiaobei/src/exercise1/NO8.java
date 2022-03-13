package exercise1;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-12-27-15:03
 * @author: Hey
 */
public class NO8 {
    static int[][] dirs={{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
    static int[][] grid = new int[9][9];
    static boolean[][] marked = new boolean[9][9];
    static String[][] input = new String[100][2];
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        while (sc.hasNext()) {
            input[i][0] = sc.next();
            input[i][1] = sc.next();
            i++;
            for (int j = 0; j < i; j++) {
                char[] start = input[j][0].toCharArray();
                char[] end = input[j][1].toCharArray();
                int sx = start[0]-'a';sx++;
                int sy = start[1]-'0';
                int ex = end[0]-'a';ex++;
                int ey = end[1]-'0';
                count=0;
                dfs(sx,sy,ex,ey,count);
                System.out.println("To get from "+start[0]+start[1]+" to "+end[0]+end[1] + " takes "+count+" knight moves.");
            }
        }
    }

    private static void dfs(int sx, int sy,int ex,int ey,int no) {
        if (sx==ex&&sy==ey){
            count=no;
            return;
        }
        for (int i = 0; i < 8; i++) {
            int newX = sx+dirs[i][0];
            int newY = sy+dirs[i][1];
            if (inArea(newX,newY)&&!marked[newX][newY]){
                marked[newX][newY] = true;
                dfs(newX,newY,ex,ey,no+1);
            }
        }
    }

    private static boolean inArea(int x, int y) {
        return x>=1&&x<=8&&y>=1&&y<=8;
    }
}
