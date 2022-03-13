package daily.week3;

/**
 * @description: 376. 摆动序列
 * @create: 2020-12-13-10:13
 * @author: Hey
 */
public class WiggleMaxLength {
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if (len<2){
            return len;
        }
        int count=2;
        int prevdiff = nums[1]-nums[0];
        for (int i = 2; i < len; i++) {
            int diff = nums[i+1] - nums[i];
            if (diff>0&&prevdiff<0||diff<0&&prevdiff>0){
                count++;
                prevdiff = diff;
            }
        }
        return count;
    }
}
