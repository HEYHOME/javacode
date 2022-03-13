package array_and_string.string;

/**
 * @description: 有效的字母异位词
 * @create: 2020-11-22-9:18
 * @author: Hey
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            table[c-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            table[c-'a']--;
            if (table[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}
