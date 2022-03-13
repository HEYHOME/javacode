package string;

import java.util.HashMap;

/**
 * 字符串中的第一个唯一字符
 *
 * @author hey
 * @creat 2020-05-08-20:41
 */
public class FirstUniqCharDemo {
    public static void main(String[] args) {
        FirstUniqCharDemo f = new FirstUniqCharDemo();
        int n = f.firstUniqChar("leetcode");
        System.out.println(n);
    }

    public int firstUniqChar(String s) {
        HashMap<Character,Integer> cout = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cout.put(c,cout.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(cout.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
