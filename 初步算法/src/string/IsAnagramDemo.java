package string;

import java.util.Arrays;

/**
 * @author hey
 * @creat 2020-05-08-21:43
 */
public class IsAnagramDemo {
    public static void main(String[] args) {

    }
    // 哈希映射
    /*public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i]!=0) {
                return false;
            }
        }
        return true;
    }*/
    // 排序
    public boolean isAnagram(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a,b)){
            return true;
        }
        return false;
    }
}
