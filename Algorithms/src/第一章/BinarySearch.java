package 第一章;

import java.util.Scanner;

/**
 * @author hey
 * @description
 * @create 2020-06-04-21:46
 */
public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo=0;
        int hi=a.length-1;
        while (lo <= hi) {
            int mid = lo+(hi-lo)/2;
            if (key < a[mid]) {
                hi=mid-1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个key: ");
        int aKay = in.nextInt();
        int[] aa = new int[5];
        System.out.println("往数组输入5个整数: ");
        for (int i = 0; i < aa.length; i++) {
            aa[i] = in.nextInt();
        }
        int ans = BinarySearch.rank(aKay,aa);
        System.out.println(ans);
    }
}
