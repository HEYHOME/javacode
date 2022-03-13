package Bit_Manipulation;

import java.util.Arrays;

/**
 * @description:
 * @create: 2020-07-16-22:06
 * @author: Hey
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,1, 1, 2, 3};
        MajorityElement m = new MajorityElement();
        int ans = m.majorityElement(nums);
        System.out.println(ans);
    }
    public  int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length >> 1];
    }
}
