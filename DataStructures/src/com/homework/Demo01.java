package com.homework;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-11-20:17
 * @author: Hey
 */
public class Demo01 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Node LA = new Node(0);
        LA.next = null;
        Demo01 test = new Demo01();
        test.creatListR(LA);
        test.turnList(LA);
        test.print(LA);
    }


    // 后插法创建单链表
    public void creatListR(Node LA) {
        Node q = LA;
        String[] s = in.nextLine().split(" ");
        for (int i = 0; i < s.length; i++) {
            Node p = new Node(Integer.parseInt(s[i]));
            p.next = null;
            q.next = p;
            q = p;
        }
    }

    // 逆转链表
    public void turnList(Node LA) {
        Node p = LA.next;
       LA.next=null;
        while (p != null) {
            Node q=p.next;
            p.next=LA.next;
            LA.next=p;
            p=q;
        }
    }

    // 打印链表
    public void print(Node L) {
        Node p = L;
        do {
            p = p.next;
            System.out.print(p);
        } while (p.next != null);
        System.out.print("\b");
    }
}
/*
class Node {
    int num;
    Node next;

    Node(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num+" ";
    }
}
*/
