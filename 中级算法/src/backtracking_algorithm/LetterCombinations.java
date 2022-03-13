package backtracking_algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 示例:
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 *
 * @create: 2020-07-27-23:12
 * @author: Hey
 */
public class LetterCombinations {
    public static void main(String[] args) {
        LetterCombinations test = new LetterCombinations();
        List<String> res = test.letterCombinations("234");
        System.out.println(res);
        // System.out.println(count);
    }

    Map<String, String> phone = new HashMap<>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    List<String> output = new ArrayList<>();

    // static int count = 0;
    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0) {
            backtrack("", digits);
        }
        return output;
    }

    private void backtrack(String curStr, String digits) {
        if (digits.length() == 0) {
            output.add(curStr);
            // count++;
        } else {
            String digit = digits.substring(0, 1);
            String letters = phone.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = letters.substring(i, i + 1);
                backtrack(curStr + letter, digits.substring(1));
            }
        }

    }
}
