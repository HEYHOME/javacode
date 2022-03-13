package array_and_string.string;

/**
 * @description: 重复的子字符串
 * @create: 2020-11-10-18:26
 * @author: Hey
 */
public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "ababab";
        // public int indexOf(String str,int fromIndex)
        // 返回指定子串的第一次出现的字符串中的索引，从指定的索引开始
        int index = s.indexOf("b", 3);
        System.out.println(index);
        String substring = s.substring(1, 3);
        System.out.println(substring);
    }
    public boolean repeatedSubstringPattern(String s) {
        String str = s+s;
        return str.substring(1,str.length()-1).contains(s);

    }
}
