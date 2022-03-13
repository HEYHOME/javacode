package array_and_string.string;

/**
 * @description: 分割平衡字符串
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * 返回可以通过分割得到的平衡字符串的最大数量
 *
 * @create: 2020-11-17-22:25
 * @author: Hey
 */
public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int count=0;
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='L'){
                count++;
            }else{
                count--;
            }
            if (count==0){
                res++;
            }
        }
        return res;
    }
}
