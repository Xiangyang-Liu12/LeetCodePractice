package Top100like;


class AddTwoNumber {
  public ListNode AddTwoNumbers(ListNode l1, ListNode l2){
      ListNode dummyHead = new ListNode(0);
      ListNode l3 = dummyHead;

      int carry = 0;
      while(l1 != null || l2 != null){
          int l1_VAL = (l1!= null) ? l1.val : 0;
          int l2_VAL = (l2 != null) ? l2.val: 0;
          
          int sum = l1_VAL + l2_VAL + carry;
          int last = sum % 10;
          carry = sum / 10;
          
          ListNode new_node = new ListNode(last);
          l3.next = new_node;

          if(l1 != null) l1 = l1.next;
          if(l2 != null) l2 = l2.next;
          l3 = l3.next;
      }
      if(carry > 0){
          ListNode new_node = new ListNode(carry);
          l3.next = new_node;
          l3 = l3.next;
      }
      return dummyHead.next;
  }
    
}
