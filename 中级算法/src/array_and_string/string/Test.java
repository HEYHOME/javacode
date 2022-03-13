package array_and_string.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020-11-15-20:44
 * @author: Hey
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = {"abca", "abce"};
        Integer[] nums = {5,3,2,4};
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char[] c1 = s1.toCharArray();
                char[] c2 = s2.toCharArray();
                int i = 0;
                while (i < c1.length && i < c2.length) {
                    if (c1[i] > c2[i]) {
                        return 1;
                    } else if (c1[i] < c2[i]) {
                        return -1;
                    }else{
                        i++;
                    }
                }
                if (i==c1.length){
                    return -1;
                }
                if (i==c2.length){
                    return 1;
                }
                return 0;
            }
        });
        for (String s : strings) {
            System.out.println(s);
        }
        Arrays.sort(nums, ((o1, o2) -> Integer.compare(o2,o1)));
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

