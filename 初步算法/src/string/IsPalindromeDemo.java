package string;

import java.util.ArrayList;
import java.util.List;

/**
 * 验证回文字符串
 *
 * @author hey
 * @creat 2020-05-08-22:07
 */
public class IsPalindromeDemo {
    public boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        char[] c=s.toLowerCase().toCharArray();
        int cs= c.length;
        for (int i = 0; i < cs; i++) {
            if ((c[i]<='z'&&c[i]>='a')||(c[i]>='0'&&c[i]<='9')){
                list.add(c[i]);
            }
        }
        int len=list.size();
        for (int i = 0; i < len/2; i++) {
            if (list.get(i)!=(list.get(len-1-i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindromeDemo ip = new IsPalindromeDemo();
        boolean bl = ip.isPalindrome("aba");
        System.out.println(bl);
    }
}

