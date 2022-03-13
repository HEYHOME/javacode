package 第一章;

import java.util.Scanner;

/**
 * @author hey
 * @description
 * @create 2020-06-04-20:54
 */
public class Test02 {
    public static void main(String[] args) {
        /*int[] a = new int[3];
        Arrays.fill(a,8);
        System.out.printf("%5d\n",123);
        System.out.printf("%d\n",123);
        System.out.println(String.format("%3.2f\n", 12.3));
        System.out.println(Math.round(3.6));
        System.out.println(Math.floorMod(14,-3));
        System.out.println(14%-3);
        System.out.println(a);// [I@7ca48474
        System.out.println(a.toString());// [I@7ca48474
        for (int value : a) {
            System.out.println(value +" ");
        }*/
      /*  System.out.println('b');
        System.out.println("b");
        System.out.println('b'+'c');
        System.out.println("b"+"c");
        System.out.println((char)(4+'a'));
        System.out.println(4+'a');
        int num = 'b'+'c';
        System.out.println(num);
        System.out.println("-------------------------");*/
       /* int f =  0;
        int g = 1;
        for (int i = 0; i <=15; i++) {
            System.out.println(f);
            f = f+g;
            g = f-g;

        }*/
       /*double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0/t+t)/2.0;
        }
        System.out.printf("%.5f\n",t);
        System.out.println("-------------------------");
        int sum =0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        int sum1 = 0;
        for (int i = 1; i < 1000; i*=2) {
            for (int j = 0; j < 1000; j++) {
                sum1++;
            }
        }
        System.out.println(sum1);
        System.out.println("------------------------");
        String s = Integer.toBinaryString(5);
        System.out.println(s);*/
        // 将一个正整数N用二进制表示并转换为一个String类型的值s
        var in = new Scanner(System.in);
        System.out.println("输入一个正整数: ");
        int N = in.nextInt();
        String s = "";
        for (int n = N; n > 0 ; n/=8) {
            s = (n%8)+s;
        }
        System.out.println("结果是:"+s);
    }

}
