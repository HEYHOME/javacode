package 第一章;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description:
 * @create: 2020-07-17-20:00
 * @author: Hey
 */
public class Test03 {
    public static void main(String[] args) {
        Integer[] arr = {3, 2, 1};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        Comparator cmp = new MyComparator();
        Arrays.sort(arr, cmp);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }
}
