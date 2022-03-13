package JA_2019;

/**
 * @description: 试题 B: 数列求值
 * 给定数列 1, 1, 1, 3, 5, 9, 17, …，从第 4 项开始，每项都是前 3 项的和。求 第 20190324 项的最后 4 位数字。
 * @create: 2020-07-16-18:43
 * @author: Hey
 */
public class B {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 3; i < 20190324; i++) {
            int temp = (a + b + c) % 10000;
            a = b;
            b = c;
            c = temp;
        }
        System.out.println(c);  // 4659
    }
}
