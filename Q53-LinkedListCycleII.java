//leetcode 142
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // No cycle possible if less than two nodes
        }

        ListNode slow = head;
        ListNode fast = head.next;

        // Step 1: Detect if there is a cycle
        while (fast != null && fast.next != null && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Check if there's actually a cycle
        if (fast == null || fast.next == null) {
            return null; // No cycle found
        }

        // Step 3: Find the starting point of the cycle
        ListNode cycleStart = head;
        while (cycleStart != slow.next) {
            cycleStart = cycleStart.next;
            slow = slow.next;
        }

        return cycleStart; // Return the starting node of the cycle
    }
}
