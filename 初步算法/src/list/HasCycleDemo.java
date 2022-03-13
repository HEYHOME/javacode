package list;

/**
 * @author hey
 * @create 2020-05-11-22:22
 */
public class HasCycleDemo {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}
