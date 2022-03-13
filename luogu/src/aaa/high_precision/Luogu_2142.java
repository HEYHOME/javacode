package aaa.high_precision;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020-12-10-20:37
 * @author: Hey
 */
public class Luogu_2142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger ans = a.subtract(b);
        System.out.println(ans);
    }
}
