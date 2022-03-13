package homework.week5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description: P1094 纪念品分组
 * @create: 2020-12-24-14:13
 * @author: Hey
 */
public class Luogu_1094 {
    public static void main(String[] args) {
        int[] prices = new int[30004];
        int count=0;
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        Arrays.sort(prices,0,n);
        int l = 0;
        int r = n-1;
        while (l <= r) {
            if (prices[l] + prices[r] <= sum) {
                l++;
                r--;
                count++;
            } else {
                r--;
                count++;
            }
        }
        System.out.println(count);
    }
}
