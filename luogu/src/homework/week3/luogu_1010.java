package homework.week3;

import java.util.Scanner;

/**
 * @description: P1010 幂次方
 * @create: 2020-12-07-18:25
 * @author: Hey
 */
public class luogu_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pow(a);
    }

    public static void pow(int a) {
        if (a > 3) {
            int s = 0;
            int b = 2;
            while (b <= a) {
                b = b * 2;
                s++;
            }
            a = a - b / 2;
            System.out.print("2(");
            pow(s);

            if (s == 3) {
                System.out.print("2+2(0)");
            }
            if (s == 1) {
                System.out.print("2(0)");
            }
            if (s == 2) {
                System.out.print("2");
            }

            System.out.print(")");

            if (a == 3) {
                System.out.print("+2+2(0)");
            }
            if (a == 1) {
                System.out.print("+2(0)");
            }
            if (a == 2) {
                System.out.print("+2");
            }
            if (a > 3) {
                System.out.print("+");
            }
            pow(a);
        }

    }
}
