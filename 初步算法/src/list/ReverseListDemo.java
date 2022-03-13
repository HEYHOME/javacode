package list;

/**
 * 反转链表
 *
 * @author hey
 * @create 2020-05-11-15:51
 */
public class ReverseListDemo {
    public static void main(String[] args) {

    }

    /*public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        ListNode temp=null;
        while (cur != null) {
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }*/
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return cur;
    }
}
