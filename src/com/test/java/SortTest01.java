package com.test.java;

/**
 * @description:
 * @create: 2020-07-28-22:09
 * @author: Hey
 */
public class SortTest01 {
    public static void main(String[] args) {
        int[] nums={6,23,1,2,3,10,1,2};
        SortTest01 test = new SortTest01();
        test.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public void sort(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j>0; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
}
