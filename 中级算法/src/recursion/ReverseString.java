package recursion;

/**
 * @description:
 * @create: 2020-10-03-20:17
 * @author: Hey
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] chars={'h','e','l','l','o','o','o'};
        ReverseString test = new ReverseString();
        test.reverseString(chars);
        for (char c : chars) {
            System.out.print(c);
        }
    }

    public void reverseString(char[] chars) {
        helper(chars,0,chars.length-1);
    }

    private void helper(char[] chars, int left, int right) {
        if (left >= right) {
            return;
        }
        char temp = chars[left];
        chars[left++] = chars[right];
        chars[right--] = temp;
        helper(chars,left,right);
    }
}
