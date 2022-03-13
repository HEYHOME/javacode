package string;

/**
 * 最长公共前缀
 *
 * @author hey
 * @creat 2020-05-11-0:24
 */
public class LongestCommonPrefixDemo {
    public static void main(String[] args) {
        LongestCommonPrefixDemo l = new LongestCommonPrefixDemo();
        String[] strings = {"flower","floor","fill"};
        String string = l.longestCommonPrefix(strings);
        System.out.println(string);
    }


    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                int index = strs[i].indexOf(prefix);

                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }


}
