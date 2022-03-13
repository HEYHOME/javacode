package list;

/**
 * @author hey
 * @create 2020-05-11-9:55
 */
public class DeleteNodeDemo {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        linkedList list = new linkedList();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        // list.deleteNode(node2);
    }

}

class linkedList {
    ListNode head = new ListNode(0);



    // 往链表里加数据
    public void add(ListNode listNode) {
        ListNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                temp = temp.next;
            }
        }
        temp.next = listNode;
    }

    // 删除链表数据
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    // 显示链表
    public void list() {
        if (head.next == null) {
            System.out.println("链表空,没有数据");
            return;
        }
        ListNode temp = head.next;
        while (true) {
            System.out.println(temp);
            if (temp.next == null) {
                break;
            } else {
                temp = temp.next;
            }
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int n) {
        val = n;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
