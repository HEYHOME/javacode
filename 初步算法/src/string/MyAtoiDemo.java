package string;

import java.util.*;

/**
 * 字符串转换整数(no)
 *
 * @author hey
 * @creat 2020-05-09-15:12
 */
public class MyAtoiDemo{
    public static void main(String[] args) {

    }
    public int myAtoi(String str) {
        List<Character> list = new ArrayList<>();
        int j = 0;
        boolean flag = true;
        char[] c = str.toCharArray();
        if (str.length() < 1) return 0;
        while (c[j] == ' ') {
            j++;
        }
        if (c[j] != '-' && c[j] != '+' && !(c[j] >= '0' && c[j] <= '9')) return 0;
        if (c[j] == '-') flag = false;
        if (c[j] == '+' || c[j] == '-') j++;
        for (; j < c.length; j++) {
            if (!(c[j] >= '0' && c[j] <= '9')) break;
            if ((c[j] >= '0' && c[j] <= '9')) {
                list.add(c[j]);
            }
        }
        int ans = 0;
        for (Character chars : list) {
            int digit = chars - '0';
            if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE && digit > 8) {
                if (flag) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            ans = ans * 10 + digit;
        }
        if (flag) {
            return ans;
        } else {
            return -ans;
        }
    }
}
