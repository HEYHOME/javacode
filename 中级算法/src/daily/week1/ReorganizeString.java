package daily.week1;

/**
 * @description: 重构字符串
 * @create: 2020-11-30-18:18
 * @author: Hey
 */

/*
    先求出出现次数最多的字符，然后再判断是否可以使得两相邻的字符不同.
 */
public class ReorganizeString {
    public static void main(String[] args) {
        String str = "aabdc";
        String s = reorganizeString(str);
        System.out.println(s);
    }
    public static String reorganizeString(String S) {
        int[] count = new int[26];  // 记录每一个字符出现的次数
        int len = S.length();
        for (int i = 0; i < len; i++) {
            count[S.charAt(i)-'a']++;
        }
        int max=0;
        int x=0;  // 记录出现次数最多的字符
        int xMax = (len+1)>>1;  // 在保证两个相同字符不相邻的情况下,一个字符最多出现的次数
        for (int i = 0; i <26 ; i++) {  // 找出出现次数最多的字符
            if (max<count[i]){
                max=count[i];
                x=i;
                if (max>xMax) return "";  // 若一个字符出现的最多次数大与xMax,
                // 说明不能使得两相邻的字符不同,返回空字符串.
            }
        }
        // 到这一步说明他可以使得两相邻的字符不同,则开始构造一个新的字符串,并返回
        char[] res = new char[len];
        int index=0;
        while (count[x]-->0){  // 把最多次数的字符放在下标为偶数的位置
            res[index] = (char)(x+'a');
            index+=2;
        }
        //然后再把剩下的字符存储在其他位置上
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                if (index >= res.length) {
                    index = 1;
                }
                res[index] = (char) (i + 'a');
                index += 2;
            }
        }
        return new String(res);
    }
}
