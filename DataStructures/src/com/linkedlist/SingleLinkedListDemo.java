package com.linkedlist;

/**
 * @author hey
 * @creat 2020-04-16-16:33
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.add(hero1);
        singleLinkedList.add(hero4);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.list();

        System.out.println("修改之后的数据");
        HeroNode newHeroNode = new HeroNode(2, "小卢", "小玉麒麟");
        singleLinkedList.update(newHeroNode);
        singleLinkedList.list();

        System.out.println("删除后的数据");
        singleLinkedList.del(1);
        singleLinkedList.list();

        System.out.println("查找的节点数据是:");
        singleLinkedList.find(2);
        //测试单链表的节点个数
        System.out.println("有效的节点个数:" + getLength(singleLinkedList.getHead()));

        //测试得到的倒数第k个节点
        HeroNode res = findLastIndexNode(singleLinkedList.getHead(), 1);
        System.out.println("res:" + res);

        //测试将单链表反转
        System.out.println("单链表反转后:");
        HeroNode newHead = reverseList(singleLinkedList.getHead());
        singleLinkedList.list(newHead);
    }

    //将单链表反转
    public static HeroNode reverseList(HeroNode head) {
        //如果当前链表为空,或者只有一个节点,无需反转,直接返回
        if (head.next == null || head.next.next == null) {
            return head;
        }
        HeroNode p = head.next;
        HeroNode q = p.next;
        p.next=null;
        while (true) {
            if (q == null) {
                break;
            }
            HeroNode r = q.next;
            q.next = p;
            p = q;
            q = r;
        }
        head.next=p;
        return  head;
    }

    //查找单链表中的倒数第k个节点
    //思路
    //1.编写一个方法,接收head节点,同时接收一个index
    //2.index表示是倒数第index个节点
    //3.先把链表从头到尾遍历,得到链表的总长度getLength
    //4.得到size后,我们从链表的第一个开始遍历(size-index)个
    //5.如果找到了,则返回该节点,否则返回null
    public static HeroNode findLastIndexNode(HeroNode head, int index) {
        //判断如果链表为空,返回null
        if (head.next == null) {
            return null;
        }
        //第一个遍历 得到链表的总长度(节点个数)
        int size = getLength(head);
        //第二次遍历 size-index位置,就是我们倒数的第k个节点
        //先做一个index的校验
        if (index <= 0 || index > size) {
            return null;
        }
        //定义辅助变量,for循环定位到倒数的index
        HeroNode cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    // 计算链表的节点数
    public static int getLength(HeroNode head) {
        if (head.next == null) {
            return 0;
        }
        HeroNode temp = head;
        int length = 0;
        while (true) {
            if (temp.next == null) {
                break;
            }
            length++;
            temp = temp.next;
        }
        return length;
    }

}

//定义SingleLinkedList 管理英雄
class SingleLinkedList {
    //先初始化一个头节点,头节点不要动,不存放具体数据
    private HeroNode head = new HeroNode(0, "", "");

    public HeroNode getHead() {
        return head;
    }

    //添加节点到单向链表
    //思路:不考虑编号的顺序
    // 1.找到当前链表的最后一个节点
    // 2.把最后一个节点的next指向一个新的节点
    public void add(HeroNode heroNode) {
        //因为头节点不能动,因此用一个辅助遍历的节点
        HeroNode temp = head;
        //遍历链表,找到最后一个节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        //找到后,把最后一个节点的next指向新的节点
        temp.next = heroNode;
    }

    // 第二种方法:在添加英雄时,根据排名将英雄插入到指定位置
    // 如果有这个排名,则添加失败,并给出提示
    public void addByOrder(HeroNode heroNode) {
        // 因为头节点不能动.因此添加一个辅助变量temp
        // 因为单链表,因此我们找的temp是位于添加位置的前一个节点,否则插入不了
        HeroNode temp = head;
        boolean flag = false;// 标志添加的编号是否存在,默认是false
        while (true) {
            if (temp.next == null) { // temp已经到链表最后
                break;
            }
            if (temp.next.no > heroNode.no) { // 位置找到
                break;
            } else if (temp.next.no == heroNode.no) {
                flag = true; // 说明编号存在
                break;
            }
            temp = temp.next;
        }
        // 判断flag
        if (flag) {
            System.out.println("编号" + heroNode.no + "已经存在");
        } else {
            // 插入到链表中
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    // 修改数据
   /* public void update(HeroNode newHeroNode) {
        // 判断链表是否为空
        if (head.next == null) {
            System.out.println("链表空,没有数据");
            return;
        }
        // 因为头节点不能动.因此添加一个辅助变量temp
        HeroNode temp = head.next;
        boolean flag = false;// 标志是否找到编号,默认为false
        while (true) {
            if (temp.no == newHeroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
            if (temp == null) {
                break;
            }
        }
        if (flag) {
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        } else {
            System.out.println("没有找到" + newHeroNode.no + "编号");
        }
    }*/

    // 修改节点数据(尝试)
    public void update(HeroNode newHeroNode) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.no == newHeroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        } else {
            System.out.println("没有" + newHeroNode.no + "这个数据");
        }
    }

    // 删除节点
    // 思路
    // 1.head不能动,因此用一个辅助变量temp找到待删除节点的前一个节点
    // 2.说明我们在比较时,是temp.next.no 和 需要删除的节点的no的比较
    public void del(int no) {
        HeroNode temp = head;
        boolean flag = false;// 标志是否找到待删除的节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == no) {
                // 找到待删除节点的前一个节点temp
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("要删除的节点" + no + "不存在");
        }
    }

    // 查找节点数据
    public void find(int no) {
        HeroNode temp = head;
        boolean flag = false; // 标志是否找到需要查找的节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == no) {
                // 找到需要查找的节点
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println(temp.next);
        } else {
            System.out.println("需要查找的节点不存在");
        }
    }

    //显示链表[遍历]
    public void list() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空,没有数据");
            return;
        }
        //因为头节点不能动,因此需要用到一个辅助变量来遍历
        HeroNode temp = head.next;
        while (true) {
            //判断是否到链表的最后
            System.out.println(temp);
            if (temp.next == null) {
                break;
            }
            //将temp后移
            temp = temp.next;
        }
    }
    //显示链表[遍历](传递头节点遍历)
    public void list(HeroNode head) {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空,没有数据");
            return;
        }
        //因为头节点不能动,因此需要用到一个辅助变量来遍历
        HeroNode temp = head.next;
        while (true) {
            //判断是否到链表的最后
            System.out.println(temp);
            if (temp.next == null) {
                break;
            }
            //将temp后移
            temp = temp.next;
        }
    }
}

//定义HeroNode,每一个HeroNode对象就是一个节点
class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;//指向下一个节点

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
