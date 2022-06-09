package List;

public class 141. Linked List Cycle {
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }
}
