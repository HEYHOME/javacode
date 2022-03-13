package com.linkedlist;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-10-10-20:45
 * @author: Hey
 */
public class LinkedListDemo {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // 创建一个头指针L指向头结点.
        Node L = new Node("", 0);
        L.next = null;
        LinkedListDemo listDemo = new LinkedListDemo();
        /*listDemo.creatListH(L,3);
        listDemo.print(L);*/
        listDemo.creatListR(L,3);
        System.out.println("单链表:");
        listDemo.print(L);

        /*Node node = listDemo.getNode(L,2);
        System.out.println("取到的第二个数是:");
        System.out.println(node);

        System.out.println("查询到name为\"小明\"的学生:");
        Node node1 = listDemo.searchNode(L, "小明");
        System.out.println(node1);*/

        /*System.out.println("在第二的位置插入一个新结点:");
        listDemo.listInsert(L,2);
        System.out.println("单链表:");
        listDemo.print(L);*/

        // System.out.println("删除第一个节点:");
        listDemo.listDelete(L,4);
        System.out.println("单链表为:");
        listDemo.print(L);
    }

    // 删除
    public void listDelete(Node L, int i) {
        Node p = L;
        int j = 0;
        while (p.next != null && j < i - 1) {
            p = p.next;
            j++;
        }
        if (p.next == null || j > i - 1) {
            System.out.println("删除失败");
            return;
        }
        p.next = p.next.next;
    }
    // 插入
    public void listInsert(Node L, int i) {
        Node p = L;
        int j=0;
        while (p != null && j < i - 1) {
            p = p.next;
            j++;
        }
        if (p == null || j > i - 1) {
            System.out.println("插入失败");
            return;
        }
        System.out.println("输入新节点的信息:");
        Node newNode = new Node(in.next(),in.nextInt());
        newNode.next = p.next;
        p.next = newNode;
    }
    // 查找
    public Node searchNode(Node L, String name) {
        Node p = L.next;
        while (p != null && !p.name.equals(name)) {
            p = p.next;
        }
        return p;
    }
    // 取值
    public Node getNode(Node L, int i) {
        Node p = L.next;
        int j=1;
        while (p!=null && j < i) {
            p=p.next;
            j++;
        }
        if (p == null || j > i) {
            System.out.println("无该值");
            return new Node("",0);
        }
        Node node = p;
        return node;
    }
    // 后插法创建单链表
    public void creatListR(Node L, int n) {
        Node q = L;
        for (int i = 0; i < n; i++) {
            Node p = new Node(in.next(),in.nextInt());
            p.next = null;
            q.next = p;
            q=p;
        }
    }
    // 前插法创建单链表
    public void creatListH(Node L, int n) {
        for (int i = 0; i < n; i++) {
            Node p = new Node(in.next(),in.nextInt());
            p.next=L.next;
            L.next = p;
        }
    }
    // 打印单链表
    public void print(Node L) {
        Node p = L;
        if (L.next == null) {
            System.out.println("单链表为空");
            return;
        }
        do {
            p = p.next;
            System.out.println(p);
        } while (p.next != null);
    }
}

class Node {
    public String name;
    public int num;
    public Node next;
    Node(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", num=" + num ;
    }
}
