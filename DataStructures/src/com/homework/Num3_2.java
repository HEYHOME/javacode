package com.homework;

import java.util.Scanner;
import java.util.Stack;

/**
 * @description:
 * @create: 2020-10-24-16:48
 * @author: Hey
 */
public class Num3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stackSum = new Stack<>();
        initStack(s1,stack1);
        initStack(s2,stack2);
        addNum(stack1,stack2,stackSum);
        displayStack(stackSum);
    }
    // 求和
    private static void addNum(Stack<Integer> stack1, Stack<Integer> stack2, Stack<Integer> stackSum) {
        boolean carry = false;
        int a ,b,sum;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (carry) {
                a=stack1.pop()+1;
            }else{
                a=stack1.pop();
            }
            b=stack2.pop();
            sum=a+b;
            // 判断是否有进位
            if (sum < 10) {
                carry=false;
            }else{
                carry=true;
            }

            if (carry) {
                sum=sum%10;
                stackSum.push(sum);
            }else{
                stackSum.push(sum);
            }
        }
        while (!stack1.isEmpty()) {
            if (stack2.isEmpty()){
                if (carry){
                    stackSum.push(stack1.pop()+1);
                    carry=false;
                }else{
                    stackSum.push(stack1.pop());
                }
            }
        }
        while (!stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                if (carry){
                    stackSum.push(stack2.pop()+1);
                    carry=false;
                }else{
                    stackSum.push(stack2.pop());
                }
            }
        }
    }

    // 初始化Stack
    private static void initStack(String s, Stack<Integer> stack) {
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i)-'0';
            stack.push(num);
        }
    }

    // 显示Stack
    private static void displayStack(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
