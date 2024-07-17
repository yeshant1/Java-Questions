//leetcode 206
class Solution {
    public ListNode reverseList(ListNode head) {

        //base case
        if(head == null || head.next == null){
            return head;
        }

        ListNode smallHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return smallHead;
        
    }
}
