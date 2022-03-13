package com.homework;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-18-11:45
 * @author: Hey
 */
public class Num2_2 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        CNode La = new CNode();
        La.next = null;
        CNode Lb = new CNode();
        Lb.next = null;
        createCharList(La);
        createCharList(Lb);
        subList(La,Lb);
        display(La);
    }

    // 打印链表
    private static void display(CNode L) {
        CNode p = L.next;
        while (p != null) {
            System.out.print(p.c+" ");
            p = p.next;
        }
        System.out.print("\b");
    }

    // 求La-Lb的差集.
    private static void subList(CNode La, CNode Lb) {
        if (La == null || Lb == null) {
            return;
        }
        CNode pa,pb,pre;
        pa=La.next;
        pre = La;
        while (pa != null) {
            pb=Lb.next;
            // 遍历Lb,找到与La相同的元素
            while (pb != null && !pa.c.equals(pb.c)) {
                pb = pb.next;
            }
            // 若没找到
            if (pb == null) {
                pre = pa;
                pa = pa.next;
            }else{  // 如果找到了
                pre.next = pa.next;
                pa = pa.next;
            }
        }
    }
    // 创建链表
    private static void createCharList(CNode L) {
        CNode r = L;
        String[] s = in.nextLine().split(" ");
        for (int i = 0;i<s.length ; i++) {
            CNode p = new CNode();
            p.c=s[i];
            p.next=null;
            r.next=p;
            r=p;

        }
    }
}



class CNode{
    String c;
    CNode next;
}

   /* CNode pa = La.next;
    CNode pb = Lb.next;
    int ia=1;
        while (pa != null) {
                if (pa.c.equals(pb.c)) {
                deleteList(pa,ia);
                ia++;
                pa=pa.next;
                pb = Lb.next;
                }else{
                pb=pb.next;
                if (pb.next == null) {
                pb = Lb.next;
                pa = pa.next;
                ia++;
                }
                }

                }*/