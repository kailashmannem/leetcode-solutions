/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next==null) {
            return null;
        }
        ListNode fast = head, slow = head;
        while (fast.next!=null) {
            fast = fast.next;
            slow = slow.next;
            if (fast.next!=null) {
                fast = fast.next;
            }
        }
        if (fast.next==null && slow.next==null) {
            head.next = null;
        }
        else {
            slow.val = slow.next.val;
            slow.next = slow.next.next;
        }
        return head;
    }
}