package homework.week3;

import java.util.Scanner;

/**
 * @description: P1990 覆盖墙壁
 * @create: 2020-12-10-10:39
 * @author: Hey
 */

/*
    ????????????????????
 */
public class Luogu_1990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 10000;
        int maxN=1000003;
        int[] f = new int[maxN];
        int[] g = new int[maxN];
        int n = sc.nextInt();
        f[0]=1;f[1]=1;g[1]=1;
        for (int i = 2; i <= n; i++) {
            f[i] = ((f[i-1]+f[i-2])%mod+2*g[i-2]%mod)%mod;
            g[i] = (f[i-1]+g[i-1])%mod;
        }
        System.out.println(f[n]);
    }
}



















