package homework.week2;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @description: P1026 统计单词个数
 * @create: 2020-11-30-20:25
 * @author: Hey
 */
public class luogu_1026 {
    final static int Len = 200;
    final static int K = 40;
    static int p,k,n;
    static String s;
    static int[][] dp;//dp[i][j]表示前i个字符,分成j个部分的话,最多能匹配多少个单词。
    static int[] mi;//mi[i]表示s[i..mi[i]]能够和字典中的某个字符串匹配,且mi[i]是最小的
    static HashSet<String> dic;

    //查找s[l..r]这个区间内有多少个字典中的字符串
    public static int get_num(int l,int r) {
        int ans = 0;
        for (int i = l;i <= r;i++) {
            if (mi[i] <= r) {//最短的如果能匹配那么就ok,如果不行的话则说明以i开头没有字符串可以和字典匹配(至少在l..r这一段)
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        p = in.nextInt();k = in.nextInt();
        dp = new int[Len+10][K+10];
        dic = new HashSet<>();
        mi = new int[Len+10];

        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        for (int i = 1;i <= p;i++) {
            String temp = in.next();
            sb.append(temp);
        }

        s = sb.toString();
        n = s.length()-1;

        p = in.nextInt();
        for (int i = 1;i <= p;i++) {
            String temp = in.next();
            dic.add(temp);//把输入的单词加入到集合当中去
        }

        //处理出来mi数组
        for (int i = 1;i <= n;i++) {
            sb = new StringBuilder();
            mi[i] = 10000000;
            for (int j = i;j <= n;j++) {
                sb.append(s.charAt(j));
                if (dic.contains(sb.toString())) {//如果s[i..j]能够匹配,则说明mi[i]=j,因为j是顺序增长的
                    mi[i] = j;
                    break;
                }
            }
        }
        for (int i = 1;i <= n;i++){
            for (int j = 0;j <= i-1;j++) {//枚举前一个状态的j
                int cost = get_num(j+1,i);//获取j+1..i这一段有多少个单词
                for (int l = 0;l <= Math.min(j, k);l++) {//枚举1..i这个字符串被分成了多少段
                    dp[i][l+1] = Math.max(dp[i][l+1],dp[j][l]+cost);//尝试更新状态
                }
            }
        }
        System.out.println(dp[n][k]);
    }

}

