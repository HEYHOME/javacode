package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020-12-05-20:25
 * @author: Hey
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] jishu = new int[n];
        int[] oushu = new int[n];
        int[] arr = new int[n];
        int a=0,b=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if ((arr[i]&1)==0){
                oushu[a] = arr[i];
                a++;
            }else{
                jishu[b] = arr[i];
                b++;
            }
        }
        Arrays.sort(jishu,0,b);
        Arrays.sort(oushu,0,a);
        if (b>0){
            for (int i = b-1; i >=0; i--) {
                if (a == 0 && i == 0) {
                    System.out.print(jishu[0]);
                }else{
                    System.out.print(jishu[i]+" ");
                }
            }

        }
        if (a>0) {
            for (int i = 0; i < a - 1; i++) {
                System.out.print(oushu[i] + " ");
            }
            System.out.print(oushu[a - 1]);
        }
    }
}
