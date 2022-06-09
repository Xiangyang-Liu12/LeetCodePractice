package List;

public class 19. Remove Nth Node From End of List {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode fast = dummy;
    ListNode slow = dummy;

    for(int i = 0; i <= n; i++){
        fast = fast.next;
    }

    while(fast != null){
        fast = fast.next;
        slow = slow.next;
    }
     slow = slow.next.next;
     return dummy.next;
    
}
