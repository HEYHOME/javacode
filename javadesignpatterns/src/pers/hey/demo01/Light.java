package pers.hey.demo01;

import java.util.Scanner;

/**
 * @description: 开灯问题
 * @create: 2020-10-01-20:29
 * @author: Hey
 */
public class Light {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();  //人数
        int[] arr = new int[n + 1];
        // Arrays.fill(arr,1);
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <=n; j++) {
                if (j % i == 0) {
                    if (arr[j]==0){
                        arr[j]=1;
                    }else{
                        arr[j]=0;
                    }
                }
            }
        }
        for (int i = 1; i <=n; i++) {
            if (arr[i] == 1) {
                System.out.print(i+" ");
            }
        }
    }
}
