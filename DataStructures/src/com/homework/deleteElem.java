package com.homework;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-15-20:36
 * @author: Hey
 */
public class deleteElem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        deleteElem d = new deleteElem();
        Node L = new Node(0);
        L.next=null;
        String[] strings = in.nextLine().split(" ");
        d.creatListR(L,strings);
        int mink = in.nextInt();
        int maxk = in.nextInt();
        d.delete(L,mink,maxk);
        d.print(L);
    }

    public void delete(Node L,int mink,int maxk) {
        Node p=L.next;
        Node q = L.next;
        int i=0,j=0;
        while (p.next != null&&p.num<mink) {
            p=p.next;
            i++;
        }
        while (q.next != null && q.num < maxk) {
            q=q.next;
            j++;
        }
        p.next=q;
    }

    public void creatListR(Node LA,String[] strings) {
        Node q = LA;
        String[] s = strings;
        for (int i = 0; i < s.length; i++) {
            Node p = new Node(Integer.parseInt(s[i]));
            p.next = null;
            q.next = p;
            q = p;
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
