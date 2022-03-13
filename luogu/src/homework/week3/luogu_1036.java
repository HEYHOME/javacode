package homework.week3;

import java.util.Scanner;

/**
 * @description: P1036 选数
 * @create: 2020-12-08-20:11
 * @author: Hey
 */
public class luogu_1036 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int k = sc.nextInt();
    static int[] nums = new int[n];
    static int count=0;
    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        dfs(k,0,0,n-1);
        System.out.println(count);
    }

    public static void dfs(int k, int sum, int start, int end) {
        if (k==0){
            if(isPrime(sum)){
                count++;
            }
            return;
        }
        for(int i=start;i<=end;i++){
            dfs(k-1,sum+nums[i],i+1,end);
        }
    }

    public static boolean isPrime(int sum) {
        if (sum==1) return false;
        for(int i=2;i*i<=sum;i++){
            if (sum%i==0){
                return false;
            }
        }
        return true;
    }
}
