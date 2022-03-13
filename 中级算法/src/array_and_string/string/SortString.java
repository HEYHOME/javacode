package array_and_string.string;

/**
 * @description:
 * @create: 2020-11-25-17:25
 * @author: Hey
 */
public class SortString {

    public String sortString(String s) {
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (num[i]>0){
                    sb.append((char) (i+'a'));
                    num[i]--;
                }
            }
            for (int i = 25; i >=0 ; i--) {
                if (num[i] > 0) {
                    sb.append((char) (i+'a'));
                    num[i]--;
                }
            }
        }
        return sb.toString();
    }
}
