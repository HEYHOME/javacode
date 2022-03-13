package pers.hey.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-05-20:52
 * @author: Hey
 */
public class RandomNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(list.size());
        for (Integer num : list) {
            System.out.print(num+" ");
        }
    }
}
