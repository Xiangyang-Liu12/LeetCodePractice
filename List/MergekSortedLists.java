package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists){
        List<Integer> list = new ArrayList<>();
        for(ListNode i : lists){
           while(i!=null){
               list.add(i.val);
               i = i.next;
           }
        }

        Collections.sort(list);
        ListNode head = new ListNode();
        ListNode p = head;

       for(int i : list){
       ListNode current = new ListNode(i);
       p.next = current;
       p = p.next;
       }
       return head.next;
    }
}
