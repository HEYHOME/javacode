package recursion;

/**
 * @description:
 * @create: 2020-10-03-20:37
 * @author: Hey
 */
public class ReverseString02 {
    public static void main(String[] args) {
        char[] chars={'h','e','l','l','o','o','o'};
        ReverseString02 test = new ReverseString02();
        test.reverseString02(chars);
        // for (char c : chars) {
        //     System.out.print(c);
        // }
    }

    public void reverseString02(char[] chars) {
        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.print(chars[i]);
        }
    }
}
