package dynamic_programming;

/**
 * @author hey
 * @description 跳跃游戏
 * @create 2020-05-18-18:09
 */
public class CanJumpDemo {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int k=0;
        for (int i = 0; i <len; i++) {
            if (i>k)return false;
            k = Math.max(k, i + nums[i]);
            if (k>=len)return true;
        }
        return true;
    }
}
