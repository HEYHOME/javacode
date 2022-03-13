package com.homework;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020-11-17-21:16
 * @author: Hey
 */
public class Num5_1 {
    private static String s;
    private static char[] str;
    private static int count=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num5_1 test = new Num5_1();
        s = sc.nextLine();
        str = s.toCharArray();
        BiTNode root = test.createBiTree();
        test.perOrderTraverse(root);
        // int res = test.getMaxWidth(root);
        // System.out.print(res);
    }

    // 输出二叉树中从最左端起每个叶子结点到根结点的路径
    char[] path = new char[100];
    int top=-1;
    int sum=0;
    BiTNode lastNode;
    boolean flag = true;
    public void perOrderTraverse(BiTNode root) {
        if (flag) {
            lastNode = perLastNode(root);
            flag = false;
        }
        if (root!=null) {
            path[++top] = root.data;
            if (root.lchild == null && root.rchild == null) {
                sum++;
                for (int i = top; i >=0 ; i--) {
                    System.out.print(path[i]);
                }
                if (root!=lastNode){
                    System.out.println();
                }
            }
            perOrderTraverse(root.lchild);
            perOrderTraverse(root.rchild);
            --top;
        }
    }
    //找到先序遍历的最后一个结点
    public BiTNode perLastNode(BiTNode root){
        if (root.rchild != null) {
            root = perLastNode(root.rchild);
        } else if (root.lchild != null) {
            root = perLastNode(root.lchild);
        }
        return root;
    }

    // 计算二叉树的最大宽度
    public int getMaxWidth(BiTNode root){
        if (root == null)
            return 0;
        Queue<BiTNode> queue = new ArrayDeque<>();
        int maxWidth = 1; // 最大宽度
        queue.add(root); // 入队

        while (true) {
            int len = queue.size(); // 当前层的节点个数
            if (len == 0)
                break;
            while (len > 0) {// 如果当前层，还有节点
                BiTNode t = queue.poll();
                len--;
                if (t.lchild != null)
                    queue.add(t.lchild); // 下一层节点入队
                if (t.rchild != null)
                    queue.add(t.rchild);// 下一层节点入队
            }
            maxWidth = Math.max(maxWidth, queue.size());
        }
        return maxWidth;
    }
    // 以先序遍历创建二叉链表
    public BiTNode createBiTree() {
        BiTNode root = new BiTNode();
        if (str[count]=='#') {
            count++;
            root = null;
        } else {
            root.data = str[count++];
            root.lchild=createBiTree();
            root.rchild=createBiTree();
        }
        return root;
    }
}
class BiTNode {
    char data;
    BiTNode lchild, rchild;
}
