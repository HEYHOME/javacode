package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hey
 * @create 2020-05-11-17:33
 */
public class IsPalindromeDemo {
    public static void main(String[] args) {
        ListNode01 head = new ListNode01(0);
        head.next=new ListNode01(-129);
        head.next.next=new ListNode01(-129);
        // head.next.next.next=new ListNode01();
        IsPalindromeDemo ip = new IsPalindromeDemo();
        boolean bl = ip.isPalindrome(head);
        System.out.println(bl);
    }
    public boolean isPalindrome(ListNode01 head) {
        List<Integer> list = new ArrayList<>();
        ListNode01 cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur=cur.next;
        }
        int p=0;
        int q=list.size()-1;
        while (p < q) {
            if (!list.get(p).equals(list.get(q))){
                return false;
            }
            p++;
            q--;
        }
        return true;
    }

}
class ListNode01 {
    int val;
    ListNode01 next;

    ListNode01(int n) {
        val = n;
    }

    @Override
    public String toString() {
        return "ListNode01{" +
                "val=" + val +
                '}';
    }
}
