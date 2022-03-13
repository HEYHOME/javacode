package daily.week4;

/**
 * @description: 389. 找不同
 * @create: 2020-12-18-16:47
 * @author: Hey
 */
public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abc";
        String t = "abcd";
        char ans = findTheDifference(s, t);
        System.out.println(ans);
    }
    public static char findTheDifference(String s, String t) {
        // 方法一 :使用异或找出唯一一个不同的字符,效率更高
        int ret = 0;
        for (int i = 0; i < s.length(); ++i) {
            ret ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            ret ^= t.charAt(i);
        }
        return (char) ret;


        // 方法二
        /*char[] as = s.toCharArray();
        char[] at = t.toCharArray();
        Arrays.sort(as);
        Arrays.sort(at);
        if (as.length==0){
            return at[0];
        }
        for (int i = 0; i < as.length; i++) {
            if (as[i]!=at[i]){
                return at[i];
            }
        }
        return at[at.length-1];*/
    }
}
