package array_and_string.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description: Z字形变换
 * @create: 2020-11-16-21:52
 * @author: Hey
 */

/*
 * 按顺序遍历字符串 s；
    1.res[i] += c： 把每个字符 c 填入对应行si;
    2.i += flag： 更新当前字符 c 对应的行索引；
    3.flag = - flag： 在达到 Z 字形转折点时，执行反向

 */
public class Convert {
    public static void main(String[] args) {
        Convert c = new Convert();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int numRows = sc.nextInt();
        String ans = c.convert(s,numRows);
        System.out.println(ans);
    }
    public String convert(String s, int numRows) {
        if (numRows<2) return s;

        List<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int pos=0,flag=-1;  // flag妙啊!!!

        for (char c : s.toCharArray()) {
            if (pos==0||pos ==numRows-1){
                flag = -flag;
            }
            rows.get(pos).append(c);
            pos+=flag;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();
    }
}
