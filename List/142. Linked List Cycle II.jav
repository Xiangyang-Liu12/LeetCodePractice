class solution{
    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                ListNode cur = head;
                while(slow != cur){
                    cur = cur.next;
                    slow = slow.next;
                }

                return cur;
            }
        }
        return null;
    }
}