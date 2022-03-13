package string;

/**
 * 反转字符串
 * @author hey
 * @creat 2020-05-08-16:01
 */
public class ReverseStringDemo {
    public static void main(String[] args) {
        char[] a = new char[]{'h','e','l','l'};
        Solution sl = new Solution();
        sl.reverseString(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        char temp;
        while (left<right){
            temp = s[left];
            s[left++]=s[right];
            s[right--]=temp;
        }

    }
}