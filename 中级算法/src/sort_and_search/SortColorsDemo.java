package sort_and_search;

/**
 * @author hey
 * @description 颜色分类
 * @create 2020-05-21-21:03
 */
public class SortColorsDemo {
    public void sortColors(int[] nums) {
        int len = nums.length;
        // int[] ans = new int[len];
        int temp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
