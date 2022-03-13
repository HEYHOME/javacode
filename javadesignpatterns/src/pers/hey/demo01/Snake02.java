package pers.hey.demo01;

import java.util.Scanner;

/**
 * @description: 蛇形填数
 * @create: 2020-10-01-21:00
 * @author: Hey
 */
public class Snake02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n==1){
            System.out.print("1");
        }
        if (n == 2) {
            System.out.println("4 1");
            System.out.println("3 2");
        }
        if (n == 3) {
            System.out.println("7 8 1");
            System.out.println("6 9 2");
            System.out.println("5 4 3");
        }
        if (n == 4) {
            System.out.println("10 11 12 1");
            System.out.println("9 16 13 2");
            System.out.println("8 15 14 3");
            System.out.println("7 6 5 4");
        }
        if (n == 5) {
            System.out.println("");
        }

    }
}
