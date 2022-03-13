package pers.hey.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description: 在1-n范围内有多少个素数
 * @create: 2020-09-30-20:17
 * @author: Hey
 */
public class PrimeNumber01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        countPrime(n);
    }

    private static void countPrime(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <=n; i++) {
            if (i % 2 == 0 && i != 2) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add(i);
            }
        }
        System.out.println("素数一共有: "+list.size()+"个.");
        System.out.println("分别是:");
        for (Integer num : list) {
            System.out.print(num+" ");
        }
        System.out.printf("\b");

    }
}
