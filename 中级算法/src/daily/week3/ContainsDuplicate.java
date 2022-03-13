package daily.week3;

import java.util.Arrays;

/**
 * @description: 217. 存在重复元素
 * @create: 2020-12-13-10:57
 * @author: Hey
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
