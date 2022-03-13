package homework.week4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description: P1223 排队接水
 * @create: 2020-12-18-14:54
 * @author: Hey
 */
public class Luogu_1223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int[] flag = new int[n];
        double sum=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }

        Arrays.sort(arr);
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr2[j]&&flag[j]==0){
                    System.out.print(j+1+" ");
                    flag[j]=1;  // 防止多余的判断,提高效率
                    break;
                }
            }
        }
        System.out.println();
        int count=n-1;
        for (int i = 0; i < n; i++) {
            sum+=arr[i]*(count--);
        }
        System.out.println(String.format("%.2f",sum/n));
    }
}
