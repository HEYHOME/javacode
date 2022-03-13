package array_and_string;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author hey
 * @description 最大数
 * 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 *
 * 示例 1:
 *
 * 输入: [10,2]
 * 输出: 210
 * 示例 2:
 *
 * 输入: [3,30,34,5,9]
 * 输出: 9534330
 * 说明: 输出结果可能非常大，所以你需要返回一个字符串而不是整数
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2020-06-27-23:07
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {
        // 1.创建一个String数组,将nums[i]转换成字符串,存储在String数组中
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        // 2.,新建一个类继承Comparator,重写compare方法,对String数组里的每一个字符串排序
        Arrays.sort(strings, new LargerNumberComparator());
        // 3.若字符串为"0",则返回"0"
        if (strings[0].equals("0")) {
            return "0";
        }
        // 4.创建一个StringBuilder
        StringBuilder ansString = new StringBuilder();
        for (String s : strings) {
            ansString.append(s);
        }
        return ansString.toString();
    }

    private static class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String order1 = o1+o2;
            String order2 = o2+o1;
            return order2.compareTo(order1);
        }
    }
}
