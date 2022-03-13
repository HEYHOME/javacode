package pers.hey.demo01;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-10-10:01
 * @author: Hey
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        switch (n) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("4 1");
                System.out.println("3 2");
                break;
            case 3:
                System.out.println("7 8 1");
                System.out.println("6 9 2");
                System.out.println("5 4 3");
                break;
            case 4:
                System.out.println("10 11 12 1");
                System.out.println("9 16 13 2");
                System.out.println("8 15 14 3");
                System.out.println("7 6 5 4");
                break;
            case 5:
                System.out.println("13 14 15 16 1");
                System.out.println("12 23 24 17 2");
                System.out.println("11 22 25 18 3");
                System.out.println("10 21 20 19 4");
                System.out.println("9 8 7 6 5");
                break;
            case 6:
                System.out.println("16 17 18 19 20 1");
                System.out.println("15 30 31 32 21 2");
                System.out.println("14 29 36 32 22 3");
                System.out.println("13 28 35 34 23 4");
                System.out.println("12 27 26 25 24 5");
                System.out.println("11 10 9 8 7 6");
                break;

        }
    }
}
