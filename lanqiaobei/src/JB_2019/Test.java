package JB_2019;


import java.util.Scanner;

/**
 * @author hey
 * @description
 * @create 2020-07-06-11:06
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        //要使用"."分割，必须使用\\转义：如：split("\\.");
        //regex为\\\\，因为在java中\\表示一个\，而regex中\\也表示\，所以当\\\\解析成regex的时候为\\。
        String[] strs = string.split("\\|");
        for (String s : strs) {
            System.out.println(s);

        }
    }
}