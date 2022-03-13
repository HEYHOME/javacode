package homework.week2;

import java.util.Scanner;

/**
 * @description: P1597 语句解析
 * @create: 2020-12-06-10:45
 * @author: Hey
 */
public class luogu_1597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strs = s.split(";");
        int[] arr = {0,0,0};
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < 1; j++) {
                char c = strs[i].charAt(j);
                char cc = strs[i].charAt(j+3);
                if ( cc>= 'a' && cc <= 'z') {
                    arr[c-'a']=arr[cc-'a'];
                }else if (cc>='0'&&cc<='9'){
                    arr[c-'a']=cc-'0';
                }
            }
        }
        System.out.println( arr[0]+" "+arr[1]+" "+arr[2]);
    }
}
