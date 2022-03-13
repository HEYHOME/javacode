package homework.week4;

import java.util.Scanner;

/**
 * @description: P1706 全排列问题
 * @create: 2020-12-13-12:16
 * @author: Hey
 */
public class Luogu_1706 {
    static int[] nums;
    static int n;
    static boolean[] marked;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        nums = new int[n+1];
        marked = new boolean[n+1];
        dfs(0);
    }
    public static void dfs(int count){
        if (count==n){
            for (int i = 0; i < n; i++) {
                System.out.printf("%5d",nums[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <=n; i++) {
            if (!marked[i-1]){
                marked[i-1]=true;
                nums[count] = i;
                dfs(count+1);
                marked[i-1] = false;
            }
        }
    }
}
