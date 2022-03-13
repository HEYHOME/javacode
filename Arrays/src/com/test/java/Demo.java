package com.test.java;

import java.util.Scanner;

/**
 * @author hey
 * @creat 2020-04-21-23:27
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int target = sc.nextInt();
        // int[] nums = new int[5];
        // int[] nums1 = new int[4];
        // int[] nums2 = new int[2];
       /* for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }*/
        // for (int i = 0; i < nums1.length; i++) {
        //     nums1[i] = sc.nextInt();
        // }
        // for (int j = 0; j < nums2.length; j++) {
        //     nums2[j] = sc.nextInt();
        // }

        Solution03 sl = new Solution03();
        int ans = sl.mySqrt(n);
        System.out.println(ans);
        // int[] arrays = sl.twoSum(nums,target);
        /*for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }*/
    }
}

class Solution03 {
        public int mySqrt(int x) {
            if (x == 0) {
                return 0;
            }
            // 注意：针对特殊测试用例，例如 2147395599
            // 要把搜索的范围设置成长整型
            long left = 1;
            long right = x / 2;
            while (left < right) {
                // 注意：这里一定取右中位数，如果取左中位数，代码会进入死循环
                long mid = left + (right - left + 1) / 2;
                // long mid = (left + right + 1) >>> 1;
                long square = mid * mid;
                if (square > x) {
                    right = mid - 1;
                } else {
                    left = mid;
                }
            }
            // 因为一定存在，因此无需后处理
            return (int) left;
        }

    }
class Solution04{
    public int binarySearch(int x){
        if (x==0) {
            return 0;
        }
        long left=1;
        long right=x/2;
        while (left<right){
            long mid=left+(right-left+1)/2;
            long square = mid*mid;
            if(square<x){
                left=mid;
            }else{
                right=mid-1;
            }
        }
        return (int)left;
    }
}







