package sort_and_search;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author hey
 * @description 最大数
 * 给定一组非负整数 nums，重新排列它们每位数字的顺序使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 * 示例 1：
 * 输入：nums = [10,2]
 * 输出："210"
 *
 * 示例 2：
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2020-06-17-22:26
 */
public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3,90,30};
        LargestNumber l = new LargestNumber();
        String res = l.largestNumber(nums);
        System.out.println(res);
    }

    private class LargerNumberComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            String order1 = o1+o2;
            String order2 = o2+o1;
            return order2.compareTo(order1);
        }
    }
    public String largestNumber(int[] nums) {
        String[] strArr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strArr,new LargerNumberComparator());
        StringBuilder sb = new StringBuilder();
        //防止测试用例中出现了[0,0,0]的情况，按道理应该返回"0"
        if (strArr[0].equals("0")) {
            return "0";
        }
       StringBuilder largestNumberStr = new StringBuilder("");
        for (String numStrArr : strArr) {
            largestNumberStr.append(numStrArr);
        }
        return largestNumberStr.toString();
    }
}
