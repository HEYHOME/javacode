package pers.hey.demo01;

import java.util.Scanner;

/**
 * @description: 判断一个整数是否为素数
 * @create: 2020-09-30-19:58
 * @author: Hey
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        yesOrNo(num);
    }

    private static void yesOrNo(int num) {
        boolean isPrime = true;
        int j=num;
        if (num == 0 || num == 1 || num == 2) {
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (j % i == 0) {
                isPrime=false;
                break;
            }
        }
        if (!isPrime) {
            System.out.println(num + "不是一个素数");
        } else {
            System.out.println(num+"是一个素数");
        }
    }
}
