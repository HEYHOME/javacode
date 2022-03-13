package homework.week2;

import java.util.Scanner;

/**
 * @description: P2010 回文日期
 * @create: 2020-12-01-19:35
 * @author: Hey
 */
public class luogu_2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] s={0,31,29,31,30,31,30,31,31,30,31,30,31};
        int c,sum;
        int count=0;
        for (int i = 1; i <=12 ; i++) {
            for (int j = 1; j <=s[i] ; j++) {
                c=(j%10)*1000+(j/10)*100+(i%10)*10+(i/10);
                sum=c*10000+i*100+j;
                if (sum<n||sum>m){
                    continue;
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
