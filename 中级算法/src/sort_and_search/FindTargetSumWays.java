package sort_and_search;

/**
 * @author hey
 * @description
 * @create 2020-06-18-12:34
 */
public class FindTargetSumWays {
    public static void main(String[] args) {
        int[] a = {1,1,1,1};
        int s = 3;
        FindTargetSumWays f= new FindTargetSumWays();
        int ans = f.findTargetSumWays(a,s);
        System.out.println(ans);
    }
    int count = 0;

    public int findTargetSumWays(int[] nums, int S) {
        calculate(nums, 0, 0, S);
        return count;
    }

    public void calculate(int[] nums, int i, int sum, int S) {
        if (i == nums.length) {
            if (sum == S)
                count++;
        } else {
            calculate(nums, i + 1, sum + nums[i], S);
            calculate(nums, i + 1, sum - nums[i], S);
        }
    }


}
