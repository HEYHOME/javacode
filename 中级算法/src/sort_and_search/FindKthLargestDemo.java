package sort_and_search;

import java.util.Arrays;

/**
 * @author hey
 * @description 数组中的第K个最大元素
 * @create 2020-05-26-23:27
 */
public class FindKthLargestDemo {
    public int findKthLargest(int[] nums, int k) {
        if (nums==null||nums.length==0){
            return 0;
        }else if (nums.length==1){
            return nums[0];
        }

        Arrays.sort(nums);
        return nums[nums.length - k];

    }
}
