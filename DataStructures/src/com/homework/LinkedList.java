package com.homework;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-11-16:22
 * @author: Hey
 */
public class LinkedList {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Node L = new Node(0);
        LinkedList l = new LinkedList();
        l.createList(L);
        int num = l.findMaxNum(L);
        System.out.println(num);
    }

    // 逆转链表
    public void turnList(Node LA) {
        Node pa = LA.next;
        Node LB = new Node(0);
        Node pb = LB;
        while (pa.next!=null) {
            pb = pa;
            pa = pa.next;
            pb.next = LB.next;
            LB.next = pb;
        }
    }
    // 前插法创建链表
    public void createList(Node L) {
       String[] s = in.nextLine().split(" ");
        for (int i = 0; i < s.length; i++) {
            Node p = new Node(Integer.parseInt(s[i]));
            p.next = L.next;
            L.next = p;
        }

    }

    // 遍历链表,找到最大值
    public int findMaxNum(Node L) {
        Node p = L;
        int max=p.next.num;
        while (p.next!=null) {
            p = p.next;
            if (p.num >max) {
                max=p.num;
            }
        }
        return max;
    }
}

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
