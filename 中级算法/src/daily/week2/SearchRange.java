package daily.week2;

/**
 * @description: 在排序数组中查找元素的第一个和最后一个位置
 * @create: 2020-12-01-13:00
 * @author: Hey
 */

public class SearchRange {
    public static void main(String[] args) {
        // 方法二的测试
        SearchRange sr = new SearchRange();
        int[] nums = {7,7,8,8,8,10};
        int target = 8;
        int[] res = sr.searchRange(nums, target);
        for(int re:res){
            System.out.println(re);
        }

        // 方法一的测试
        /*int[] nums= new int[]{5};
        int target = 8;
        int[] res = searchRange(nums,target);
        for (int re : res) {
            System.out.println(re);
        }*/
    }
    // 方法一:
    // 直观的思路肯定是从前往后遍历一遍。用两个变量记录第一次和最后一次遇见 target 的下标，
    // 但这个方法的时间复杂度为 O(n)O(n)，没有利用到数组升序排列的条件。
    // 由于数组已经排序，因此整个数组是单调递增的，我们可以利用二分法来加速查找的过程
    /*public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums.length == 0) {
            return res;
        }
        int len = nums.length;
        int count = 0;
        int start = 0, end = 0;
        for (int i = 0; i < len; i++) {
            if (target == nums[i]) {
                count++;
            }
        }
        for (int i = 0; i < len; i++) {
            if (target == nums[i]) {
                start = i;
                break;
            }
        }
        if (count>0){
            end = start + count-1;
            res[0] = start;
            res[1] = end;
            return res;
        }
        return res;
    }*/
    // 方法二:
    // 使用二分查找,时间复杂度:O(logN),空间复杂度:O(1)
    public int[] searchRange(int[] nums,int target){
        int len = nums.length;
        if (len==0) return new int[]{-1,-1};
        int firstPosition = findFirstPosition(nums,target);
        if (firstPosition==-1) return new int[]{-1,-1};
        int lastPosition = findLastPosition(nums,target);
        return new int[]{firstPosition, lastPosition};
    }
    private int findFirstPosition(int[] nums,int target){
        int left=0;
        int right = nums.length-1;
        while (left < right) {
            int mid = left+(right-left)/2;
            if (nums[mid] > target) {
                right = mid-1;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else if (nums[mid] == target) {
                right = mid;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
    private int findLastPosition(int[] nums,int target){
        int left=0;
        int right = nums.length-1;
        while (left < right) {
            int mid = left+(right-left+1)/2;
            if (nums[mid] > target) {
                right = mid-1;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else if (nums[mid] == target) {
                left = mid;
            }
        }
        return left;
    }

}
