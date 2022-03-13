package JB_2019;

import java.util.Scanner;

/**
 * @author hey
 * @description 试题F:特别数的和
 * @create 2020-07-06-19:13
 */
public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            String str = i + "";
            for (char c : str.toCharArray()) {
                if (c == '2' || c == '0' || c == '1' || c == '9') {
                    sum+=i;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
    /*public static boolean isValid(int num) {
        while(num > 0) {
            int g = num % 10;//获取个位数
            if(g == 2 || g == 0 || g == 1 || g == 9) return true;
            num = num / 10;//去掉个位数
        }
        return false;*/
}
