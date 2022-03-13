package daily.week4;

/**
 * @description: 738. 单调递增的数字
 * @create: 2020-12-15-18:53
 * @author: Hey
 */
/*
    思路:
        方法一的思路是从最大开始遍历,把遍历到的数字转化成字符串来处理,
        但此方法的时间复杂度为O(n^2),当N足够大时(如N=10^9),会出现超时.

        方法二的思路是先把数字转换成字符串,遍历字符串,找到第一个位置i使得chars[i-1]>chars[i],
        然后将chars[i-1]-1,把位置i-1后面的数字赋值成'9'.如N=123542->123499.
        但存在一个问题:但chars[i-1]-1后可能会导致chars[i-2]>chars[i-1],
        因此我们需要从 i-1 开始递减比较相邻数位的关系，直到找到第一个位置 j
        使得strN[j] 自身数位减 1后strN[j−1] 和 strN[j] 仍然保持递增关系，
        或者位置 j 已经到最左边（即 j 的值为 0），此时我们将 [j+1,n-1] 的数
        全部变为 9才能得到最终正确的答案.

 */
public class MonotoneIncreasingDigits {

    public static void main(String[] args) {
        int ans = monotoneIncreasingDigits(10);
        System.out.println(ans);
    }
    public static int monotoneIncreasingDigits(int N){
        char[] chars = Integer.toString(N).toCharArray();
        int i=1;
        while (i < chars.length && chars[i - 1] <= chars[i]) {
            i++;
        }
        if (i < chars.length) {
            while (i > 0 && chars[i - 1] > chars[i]) {
                chars[i-1]--;
                i--;
            }
            for (i += 1; i < chars.length; i++) {
                chars[i] = '9';
            }
        }
        return Integer.parseInt(new String(chars));
    }

    // 该方法会TLE
    /*public static int monotoneIncreasingDigits(int N) {
        for (int i = N; i >= 0; i--) {
            if (isIncreasing(i)){
                return i;
            }
        }
        return 0;
    }

    public static boolean isIncreasing(int n) {
        String s = n+"";
        char cc = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (cc <= c) {
                cc=c;
            }else{
                return false;
            }
        }
        return true;
    }*/

}
