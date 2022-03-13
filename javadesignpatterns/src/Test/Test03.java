package Test;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-11-03-23:24
 * @author: Hey
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        a  = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
