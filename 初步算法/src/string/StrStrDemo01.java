package string;

/**
 * @author hey
 * @creat 2020-05-10-21:56
 */
public class StrStrDemo01 {
    public static void main(String[] args) {

    }

    public int strStr(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();

        for (int start = 0; start < n - L + 1; ++start) {
            if (haystack.substring(start, start + L).equals(needle)) {
                return start;
            }
        }
        return -1;
    }


}
