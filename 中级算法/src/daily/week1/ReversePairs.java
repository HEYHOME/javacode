package daily.week1;

/**
 * @description: 翻转对
 * @create: 2020-11-28-22:05
 * @author: Hey
 */
public class ReversePairs {
    public static void main(String[] args) {
        int[] nums={2147483647,2147483647,2147483647,2147483647};
        int res = reversePairs(nums);
        //System.out.println(res);

    }
    public static int reversePairs(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                long ni=nums[i],nj = nums[j]*2;
                if (ni>nj) count++;
            }
        }
        return count;
    }
}
