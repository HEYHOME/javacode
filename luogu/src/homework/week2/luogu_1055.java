package homework.week2;

import java.util.Scanner;

/**
 * @description: P1055 ISBN号码
 * @create: 2020-11-30-12:25
 * @author: Hey
 */
public class luogu_1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("-");
        int len = str.length;
        int x=1;
        int sum=0;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                int num = str[i].charAt(j)-'0';
                sum+=num*x;
                x++;
            }
        }
        String slast1,slast2;
        if (sum%11==10){
            slast1 = "X";
        }else{
             slast1 = sum%11+"";
        }
         slast2=str[len-1];
        if (slast1.equals(slast2)){
            System.out.println("Right");
        }else{
            str[len-1]=slast1;
            for (int i = 0; i < len-1; i++) {
                System.out.print(str[i]+"-");
            }
            System.out.println(str[len-1]);
        }
    }
}
