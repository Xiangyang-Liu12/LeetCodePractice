package List;

import java.util.Collections;

public class MergekSortedLists {
   public ListNode mergeKList(ListNode[] lists){
       List<Integer> list = new ArrayList<>();
       for(ListNode d : lists){
           while(d!=null){
               list.add(d.val);
               d = d.next;
           }
       }

       Collections.sort(list);

       ListNode dummy = new ListNode(-1);
       ListNode p = dummy;
       for(int i : list){
           ListNode current = new ListNode(-1);
           p.next = current;
           p = p.next;
       }

       return dummy.next;
   }
}
