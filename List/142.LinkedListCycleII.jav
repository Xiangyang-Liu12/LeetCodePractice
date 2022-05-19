class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

public class solution{
  pulic ListNode deterCycle(ListNode head){
      if(head == null) return null;
      ListNode fast = head;
      ListNode slow = head;

      while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
          if(fast == slow){
              ListNode current = head;
              while(current ! = slow){
                  slow = slow.next;
                  current = current.next;
              }
              return current;
          }
      }
      return null;
  }
}