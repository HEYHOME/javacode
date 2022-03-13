package homework.week1;

import java.util.Scanner;

/**
 * @description: P1179 数字统计
 * @create: 2020-11-28-17:03
 * @author: Hey
 */
public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int count=0;
        String s;
        for(int i=L;i<=R;i++){
            s=i+"";
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j)=='2'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
