package array_and_string.string;

import java.util.Scanner;

/**
 * @description: 字符串中的单词数
 * @create: 2020-11-16-22:29
 * @author: Hey
 */
public class CountSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountSegments c = new CountSegments();
        String s = sc.nextLine();
        int ans = c.countSegments(s);
        System.out.println(ans);
    }
    public int countSegments(String s) {
        // 方法1
        /*int count=0;
        int[] arr = new int[s.length()+1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        for (int i = 1; i <= s.length(); i++) {
            if (arr[i]!=arr[i-1]){
                count++;
            }
        }
        return (count+1)/2;*/

        // 方法2
        /*String trims = s.trim();  // 避免s开头出现一个或多个空格,造成多出一个空串.
        if (trims.equals("")) {
            return 0;
        }
        String[] str = trims.split("\\s+");
        for (String s1 : str) {
            System.out.println(s1);
        }
        return str.length;*/

        // 方法3
       int count=0;
        for (int i = 0; i < s.length(); i++) {
            if ((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
}
