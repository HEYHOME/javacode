package com.test.java;

/**
 * @description:
 * @create: 2020-07-28-22:03
 * @author: Hey
 */
public class SortTest {
    public static void main(String[] args) {
        int[] nums={3,2,1};
        SortTest test = new SortTest();
        test.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public void sort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int min=i;
            for (int j = i; j <len ; j++) {
                if (nums[min] > nums[j]) {
                    min=j;
                }
            }
            int temp = nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
    }
}
