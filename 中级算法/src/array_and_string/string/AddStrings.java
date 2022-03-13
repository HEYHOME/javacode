package array_and_string.string;

import java.util.Scanner;

/**
 * @description: 字符串相加
 * @create: 2020-11-17-21:26
 * @author: Hey
 */
public class AddStrings {
    public static void main(String[] args) {
        AddStrings a = new AddStrings();
        Scanner sc = new Scanner(System.in);
        String num1= sc.next();
        String num2 = sc.next();
        String s = a.addStrings(num1, num2);
        System.out.println(s);
    }

    // 方法二
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (i>=0||j>=0) {
            int a = i >= 0 ? num1.charAt(i)-'0' : 0;
            int b = j >= 0 ? num2.charAt(j)-'0' : 0;
            int sum = a + b + carry;
            res.append(sum%10);
            carry = sum/10;
            i--;j--;
        }
        if (carry==1) res.append(1);
        return res.reverse().toString();
    }

    // 方法一
    /*public String addStrings(String num1, String num2) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        Stack<Integer> addStack = new Stack<>();
        int carry = 0;
        for (char c : num1.toCharArray()) {
            stack1.push(c);
        }
        for (char c : num2.toCharArray()) {
            stack2.push(c);
        }
        while (!stack1.isEmpty()||!stack2.isEmpty()) {
            int a = stack1.isEmpty()? 0:stack1.pop()-'0';
            int b = stack2.isEmpty()?0:stack2.pop()-'0';
            int sum = a+b+carry;
            addStack.push(sum%10);
            carry = sum/10;
        }
        StringBuilder res = new StringBuilder();
        for (Integer num : addStack) {
            res.append(num);
        }
        if (carry==1){
            res.append(1);
        }
        return res.reverse().toString();

    }*/
}
