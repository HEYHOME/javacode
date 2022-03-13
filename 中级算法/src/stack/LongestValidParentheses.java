package stack;

import java.util.Stack;

/**
 * @description: 最长有效括号
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 * 示例 1:
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 *
 * 示例 2:
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create: 2020-07-28-15:21
 * @author: Hey
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                stack.push(i);
            }else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                }else {
                    ans = Math.max(ans,i-stack.peek());
                }
            }
        }
        return ans;
    }
}
