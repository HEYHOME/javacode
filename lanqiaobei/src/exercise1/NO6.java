package exercise1;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-12-27-14:25
 * @author: Hey
 */
public class NO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=200 ; i++) {
            int sum=0;
            for (int j = i; j < 10000000; j++) {
                sum+=j;
                if (sum == n) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
