package homework.week3;

import java.util.Scanner;

/**
 * @description: P1464 Function
 * @create: 2020-12-08-21:09
 * @author: Hey
 */
public class luogu_1464 {
    static int[][][] f = new int[25][25][25];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==-1&&b==-1&&c==-1) {
                break;
            }
            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));
        }
    }

    private static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        } else if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20);
        }  else if (f[a][b][c] != 0) {  // 记忆化搜索,这行代码必须放在这里,放在后面会TLE.
            return f[a][b][c];
        }else if (a < b && b < c) {
            f[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
             f[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
        return f[a][b][c];
    }
}
