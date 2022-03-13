package com.test.java;

import java.util.Scanner;

/*
 * 题目
【问题描述】
一个正整数如果任何一个数位不大于右边相邻的数位，则称为一个数位递增的数，例如1135是一个数位递增的数，而1024不是一个数位递增的数。
给定正整数 n，请问在整数 1 至 n 中有多少个数位递增的数？
【输入格式】
输入的第一行包含一个整数 n。
【输出格式】
输出一行包含一个整数，表示答案。
【样例输入】
30
【样例输出】
26
【评测用例规模与约定】
对于 40% 的评测用例，1 <= n <= 1000。
对于 80% 的评测用例，1 <= n <= 100000。
对于所有评测用例，1 <= n <= 1000000。

 */

public class 数位递增的数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        work(n);
    }

    static void work(int n){
        int ans = 0;
        for(int i = 1;  i <= n ; i++){
            String s = ""+i; //把整数 转为字符串 ，方便比较
            boolean flag = true;

            for(int j = 1 ; j < s.length() ; j++){
                //charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
                if(s.charAt(j-1) > s.charAt(j)){ //后一个数 大于 前一个数，跳出
					// System.out.print(s.charAt(j - 1) + " " + s.charAt(j )+"\n");
					// System.out.print(s +"\n");
                    flag = false;
                    break;
                }

            }
            if(flag){ //如果为true,计数
                ans++;
            }
        }
        System.out.println(ans);
    }
}
