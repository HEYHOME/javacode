package homework.week1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description: P1716 双调序列
 * @create: 2020-12-01-12:42
 * @author: Hey
 */
public class luogu_1716 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int p=0,q=nums.length-1;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        while (p < q) {
            System.out.println(nums[q--]);
            System.out.println(nums[p++]);
        }
        if ((n&1)==1){  // n为奇数
            System.out.println(nums[p]);
        }
    }
}
