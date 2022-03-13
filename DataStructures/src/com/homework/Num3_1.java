package com.homework;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-24-16:43
 * @author: Hey
 */
public class Num3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        boolean res = isPalindrome(s);
        System.out.println(res);
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (!(s.charAt(i) == s.charAt(s.length() - 1-i))) {
                return false;
            }
        }
        return true;
    }
}
