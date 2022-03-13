package array_and_string.string;

import java.util.Scanner;

/**
 * @description: 替换所有的问号
 * @create: 2020-11-10-19:10
 * @author: Hey
 */
public class ModifyString {
    public static void main(String[] args) {
        ModifyString ms = new ModifyString();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = ms.modifyString(s);
        System.out.println(ans);
        int ans2 = "acbb".compareTo("afdd");
        System.out.println(ans2);
    }

    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                char ahead = i == 0 ? ' ' : chars[i - 1];
                char behind = i == chars.length - 1 ? ' ' : chars[i + 1];
                char temp = 'a';
                while (temp == ahead || temp == behind) {
                    temp++;
                }
                chars[i] = temp;
            }
        }
        return new String(chars);
    }
}
