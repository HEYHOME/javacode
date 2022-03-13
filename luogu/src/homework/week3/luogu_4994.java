package homework.week3;

import java.util.Scanner;

/**
 * @description: P4994 终于结束的起点
 * @create: 2020-12-09-21:13
 * @author: Hey
 */
public class luogu_4994 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] f = new int[3];
        f[0] = 0; // 存储下一个即将更新的值
        f[1] = 1; // 记录当前
        f[2] = 1; // 记录下一个
        for (int i = 1;  ; i++) {
            f[0] = f[2];
            f[2] = (f[2]+f[1])%m;
            f[1] = f[0];
            if (f[1]%m==0&&f[2]%m==1){
                System.out.println(i+1);
                break;
            }
        }
    }
}
