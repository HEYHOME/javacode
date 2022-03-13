package com.list;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-09-21-15:33
 * @author: Hey
 */
public class LinkedList {



    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int ans = 0;

    int[] nums = new int[10];

    for (int i = 0; i < 10; i++) {

    nums[i] = in.nextInt();

    }

    int targit = in.nextInt();

    for (int i = 0; i < 10; i++) {

        if (targit == nums[i]) {

            ans = i + 1;

        }
    }if (ans == 0) {

    System.out.println("error");

    } else {

   System.out.println(ans);

    }

    }

}