package pers.hey.demo01;

import java.util.*;

/**
 * @description:
 * @create: 2020-10-05-21:24
 * @author: Hey
 */
public class RandomNum01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            int num = in.nextInt();
            if (!list.contains(num)) {
                list.add(num);
            }
            n--;
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list.size());
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        // Arrays.sort(list);
    }
}
