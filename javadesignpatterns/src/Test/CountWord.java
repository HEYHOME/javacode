package Test;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-11-04-22:37
 * @author: Hey
 */
public class CountWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count=1;
        int first=0;
        // 若第一个单词的前面有空格,则用first找到第一个字母
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                break;
            }else{
                first = i;
            }
        }
        // 若i为空格且j不为空格,单词数+1
        for (int i = first+1; i < s.length()-1; i++) {
            for (int j = i+1; j < i+2; j++) {
                if (s.charAt(i) == ' ' && s.charAt(j) != ' ') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
