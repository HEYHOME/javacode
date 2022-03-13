package homework.week1;

import java.util.Scanner;

/**
 * @description: 地毯
 * @create: 2020-11-25-19:36
 * @author: Hey
 */
public class Carpet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[1005][1005];
        for (int i = 1; i <= m; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for (int j = x1; j <=x2; j++) {
                map[j][y1]++;
                map[j][y2+1]--;
            }
        }

        for (int i = 1; i <= n; i++) {
            int sum=0;
            for (int j = 1; j <= n; j++) {
                sum+=map[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
