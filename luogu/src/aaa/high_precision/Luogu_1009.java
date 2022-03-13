package aaa.high_precision;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @description: P1009 阶乘之和
 * @create: 2020-12-10-20:44
 * @author: Hey
 */
public class Luogu_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= n; i++) {
            BigInteger sum_j = BigInteger.ONE;
            for (int j = 1; j <=i ; j++) {
                sum_j=sum_j.multiply(BigInteger.valueOf(j));
            }
            sum = sum.add(sum_j);
        }
        System.out.println(sum);
    }
}
