package array_and_string.string;

import java.util.Scanner;
import java.util.Stack;

/**
 * @description: 括号的最大嵌套深度
 * @create: 2020-11-10-20:03
 * @author: Hey
 */
public class MaxDepth {
    public static void main(String[] args) {
        MaxDepth md = new MaxDepth();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = md.maxDepth(s);
        System.out.println(ans);
    }
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int max=0;
        if (s.length() == 0) {
            return 0;
        }
        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(aChar);
            } else if (aChar == ')') {
                stack.pop();
            }
            max = Math.max(max, stack.size());
        }
        return max;
    }
}
