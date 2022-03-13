package homework.week1;

import java.util.Scanner;

/**
 * @description: cantor表
 * @create: 2020-11-25-19:10
 * @author: Hey
 */

/**
 * 找规律:
 * 1/1
 * 1/2 2/1
 * 3/1 2/2 1/3
 * 1/4 2/3 3/2 4/1
 * 5/1 4/2 3/3 2/4 1/5
 * i:表示行,j表示列
 * 奇数行:i-j+1/j
 * 偶数行:j/i-j+1
 *
 */
public class Cantor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while (i < n) {
            n-=i;
            i++;
        }
        // 偶数行,i表示行,n为列
        // 否则,奇数行
        if (i % 2 == 0) {
            System.out.println(n+"/"+(i-n+1));
        }else{
            System.out.println((i-n+1)+"/"+n);
        }
    }
}
