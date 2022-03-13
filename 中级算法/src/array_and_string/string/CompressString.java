package array_and_string.string;

/**
 * @description:  字符串压缩
 * @create: 2020-11-09-21:20
 * @author: Hey
 */

import java.util.Scanner;

/**
 * 使用双指针
 * p标志第一个字符,q=p,q往后遍历,count++,遇到不一样的字符停下,
 * 然后记录count和p,再把p=q,依次反复循环,直到q指向最后一个字符.
 * 1.如何把count和相对应的字符连接在一起???
 * 解:使用StringBuffer的append方法;
 *
 * 自我评价:
 *   思路大体正确,还行.
 */
public class CompressString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String res = compressString(s);
        System.out.println(res);
    }
    public static String compressString(String S) {
        if (S.length() == 0) {
            return S;
        }
        int p=0,q;
        StringBuffer sb = new StringBuffer();
        while(p< S.length()){
            q=p;
            while (q<S.length()&&S.charAt(p)== S.charAt(q)){
                q++;
            }
            sb.append(S.charAt(p));
            sb.append(q-p);
            p=q;
        }
        return sb.length()<S.length()? sb.toString():S;
    }

}
