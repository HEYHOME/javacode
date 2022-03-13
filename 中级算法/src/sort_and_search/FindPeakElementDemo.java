package sort_and_search;

/**
 * @author hey
 * @description 寻找峰值
 * @create 2020-05-26-23:38
 */
public class FindPeakElementDemo {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length-1;
    }
}
