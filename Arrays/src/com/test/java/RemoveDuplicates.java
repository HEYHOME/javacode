package com.test.java;

import java.util.Scanner;

/**
 * @author hey
 * @creat 2020-04-21-17:58
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[7];
        for (int i = 0; i < 7; i++) {
            nums[i] = sc.nextInt();
        }
        int n = Solution02.removeDuplicates(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
            System.out.print(" ");
        }
    }
}

class Solution02 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
   /* public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while(q < nums.length){
            if(nums[p] != nums[q]){
                if(q - p > 1){
                    nums[p + 1] = nums[q];
                }
                p++;
            }
            q++;
        }
        return p + 1;
    }
*/
}