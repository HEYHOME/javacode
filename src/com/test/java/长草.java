package com.test.java;

import java.util.Scanner;

/**
 * @author hey
 * @creat 2020-04-20-20:03
 */
public class 长草 {
    static char[][] map = new char[1001][1001];
    static int[][] book = new int[1001][1001];
    static int n, m; // 行，列
    static int k; // 扩展次数
    static int[][] swap = {{0,1}, {1,0},{0,-1},{-1,0}};//右下左上
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            String s = sc.next(); //输入一行
            map[i] = s.toCharArray(); //把一行变成字符数组
        }

        k = sc.nextInt(); //草长的次数
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(map[i][j] == 'g'){ //等于 草
                    book[i][j] = 1; //标记  1
                }
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(book[i][j] == 1){ //找到草的位置，进行dfs种草
                    dfs(i,j,0); //0是次数（题意月份）
                }
            }
        }
        //输出
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

    }

    private static void dfs(int x ,int y , int month){
        if(month == k){ //结束条件 ,等于次数
            return;
        }

        int tx = 0;
        int ty = 0;

        for(int i = 0 ; i < 4 ; i++){ //四个方向进行
            tx = x + swap[i][0];
            ty = y + swap[i][1];

            if(tx < 0 || tx >=n || ty < 0 || ty >= m){ // 越界
                continue;
            }

            map[tx][ty] = 'g';//种草

            dfs(tx , ty , month + 1); //递归,月份加1
        }

    }
}
