package JB_2019;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author hey
 * @description 试题B:不同子串
 * 一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成 的串。
 * 例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共 7 个。
 * 注意在计算时，只算本质不同的串的个数。
 * 请问，字符串0100110001010001 有多少个不同的非空子串？
 * @create 2020-07-04-21:15
 */
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j <= str.length() - i; j++) {
                String subStr = str.substring(j, j + i);
                if (!list.contains(subStr)) {
                    list.add(subStr);
                }
            }
        }
        System.out.println(list.size());
    }
}
