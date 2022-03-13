package dynamic_programming;

import java.util.Scanner;

/**
 * @author hey
 * @description 最长回文子串
 * @create 2020-05-20-20:43
 */
public class LongestPalindromeDemo {
    public static void main(String[] args) {
        LongestPalindromeDemo l = new LongestPalindromeDemo();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String ans = l.longestPalindrome(string);
        System.out.println(ans);
    }

    // 中心扩展
    public String longestPalindrome(String s) {
       int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen=1;
        String res = s.substring(0,1);
        for (int i = 0; i <len-1 ; i++) {
            String oddStr = centerSpread(s,i,i);// 中心是奇数
            String evenStr = centerSpread(s,i,i+1);// 中心是偶数
            String maxStr = oddStr.length()>evenStr.length()?oddStr:evenStr;
            if (maxStr.length() > maxLen) {
                maxLen = maxStr.length();
                res = maxStr;
            }
        }
        return res;
    }

    private String centerSpread(String s, int left, int right) {
        int len = s.length();
        int L = left;
        int R = right;
        while (L >= 0 && R < len) {
            if (s.charAt(L) == s.charAt(R)) {
                L--;
                R++;
            }else {
                break;
            }
        }
        return s.substring(L+1,R);
    }

    // 暴力解法,超时
    /*public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <= len; j++) {
                String test = s.substring(i,j);
                if (isPalindromic(test) && test.length() > max) {
                    ans = s.substring(i,j);
                    max = Math.max(max,ans.length());
                }
            }
        }
        return ans;
    }

    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len/2; i++) {
            if (s.charAt(i)!=s.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }*/
}
