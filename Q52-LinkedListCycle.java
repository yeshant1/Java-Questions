//leetcode 141
//leetcode 141
public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null){
            fast = fast.next;
            if(fast != null){
              fast = fast.next;
            }
           slow = slow.next;

        if(slow == fast){
         return true;
        }
     return false;
  }
 }
