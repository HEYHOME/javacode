package homework.week1;

import java.util.Scanner;

/**
 * @description: P1149 火柴棒等式
 * @create: 2020-12-05-19:53
 * @author: Hey
 */
public class luogu_1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {6,2,5,5,4,5,6,3,7,6};
        int n = sc.nextInt();
        n-=4;
        int count=0;
        int[] a = new int[2010];
        for (int i = 0; i < 2010; i++) {
            int j=i;
            do {
                a[i] += nums[j%10];
                j/=10;
            }while (j>0);
        }
        for (int i = 0; i < 1005; i++) {
            for (int j = 0; j < 1005; j++) {
                if (a[i]+a[j]+a[i+j]==n){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
