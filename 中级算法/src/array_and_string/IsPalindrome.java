package array_and_string;

/**
 * @author hey
 * @description
 * @create 2020-06-19-17:42
 */
public class IsPalindrome {
    public boolean isPalindrome(String s){
        StringBuilder stringBuilder = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stringBuilder.append(ch);
            }
        }
        int left = 0;
        int right = stringBuilder.length()-1;
        while (left < right) {
            if (Character.toLowerCase(stringBuilder.charAt(left)) != Character.toLowerCase(stringBuilder.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
