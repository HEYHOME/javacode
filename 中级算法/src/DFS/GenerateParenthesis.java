package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 示例：
 * 输入：n = 3
 * 输出：[
 *        "((()))",
 *        "(()())",
 *        "(())()",
 *        "()(())",
 *        "()()()"
 *      ]
 * @create: 2020-07-27-21:33
 * @author: Hey
 */
public class GenerateParenthesis {
    public static void main(String[] args) {
        GenerateParenthesis test = new GenerateParenthesis();
        List<String> res = test.generateParenthesis(1);
        System.out.println(res);
    }
    public List<String> generateParenthesis(int n) {
       List<String> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        dfs("",n,n,res);
        return res;
    }
    /*
    curStr:当前递归得到的结果
    left:左括号还剩多少个
    right:右括号还剩多少个
     */
    private void dfs(String curStr, int left, int right, List<String> res) {
        if (left == 0 && right == 0) {
            res.add(curStr);
            return;
        }
        if (left > right) {  // 但左括号剩余比右括号多时,剪枝.如 ())
            return;
        }
        if (left > 0) {
            dfs(curStr+"(",left-1,right,res);
        }
        if (right > 0) {
            dfs(curStr+")",left,right-1,res);
        }
    }

}
