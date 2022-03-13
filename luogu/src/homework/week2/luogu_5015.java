package homework.week2;

import java.util.Scanner;

/**
 * @description: P5015 标题统计
 * @create: 2020-11-30-12:17
 * @author: Hey
 */
public class luogu_5015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
