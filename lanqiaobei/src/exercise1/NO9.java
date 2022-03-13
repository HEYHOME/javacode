package exercise1;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-12-27-16:15
 * @author: Hey
 */
public class NO9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] area = new int[n][2];
        for (int i = 0; i < n; i++) {
            area[i][0] = sc.nextInt();
            area[i][1] = sc.nextInt();
        }
        int x=1;
        for (int i = 0; i < n; i++) {
            for (int j = 100; j >0 ; j--) {
                if (area[i][0] * area[i][1] > j * j * x) {
                    
                }
            }

        }
    }
}
