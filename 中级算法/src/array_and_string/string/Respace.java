package array_and_string.string;

/**
 * @description: 恢复空格
 * @create: 2020-11-10-20:20
 * @author: Hey
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *动态规划解决问题:
 * 1.假设dp表达的含义:
 *  dp[i]表示字符串的前i个字符的最少未匹配数
 * 2.思考状态转移方程:
 *  假设当前我们已经考虑完了前 i 个字符了，对于前 i + 1 个字符对应的最少未匹配数：
 *    a.第 i + 1 个字符未匹配，则 dp[i + 1] = dp[i] + 1，即不匹配数加 1;
 *    b.遍历前 i 个字符，若以其中某一个下标 idx 为开头、以第 i + 1 个字符为结尾的字符串正好在词典里，
 *    则 dp[i] = min(dp[i],dp[idx]) 更新 dp[i]
 *
 */
public class Respace {
    public int respace(String[] dictionary, String sentence) {
            Set<String> dict = new HashSet<>(Arrays.asList(dictionary));
            int n = sentence.length();
            int[] dp = new int[n+1];
            for (int i = 1; i <= n; i++) {
                dp[i] = dp[i-1]+1;
                for (int idx = 0; idx < i; idx++) {
                    if (dict.contains(sentence.substring(idx,i))){
                        dp[i] = Math.min(dp[i], dp[idx]);
                    }
                }
            }
        return dp[n];
    }
}
