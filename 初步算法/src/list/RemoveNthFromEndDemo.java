package list;

/**
 * 删除链表的倒数第n个节点
 *
 * @author hey
 * @create 2020-05-11-11:32
 */
public class RemoveNthFromEndDemo {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        ListNode q = dummy;
        for (int i = 0; i < n + 1; i++) {
            q = q.next;
        }
        while (q != null) {
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;
        return dummy.next;
    }
}
