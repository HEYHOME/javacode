package homework.week1;

import java.util.Scanner;

/**
 * @description: 疯狂的采药
 * @create: 2020-11-25-21:30
 * @author: Hey
 */
public class Medicine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] w = new int[100001];
        int[] v = new int[100001];
        long[] f = new long[100000001];
        int t = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        for (int i = 1;i<=m;i++){
            for (int j = w[i]; j <=t ; j++) {
                f[j] = Math.max(f[j],f[j-w[i]]+v[i]);
            }
        }
        System.out.println(f[t]);
    }
}
