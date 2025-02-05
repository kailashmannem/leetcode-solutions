/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                delete(current);
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public ListNode delete(ListNode current) {
        if (current.next.next == null) {
            current.next = null;
        } else {
            current.next = current.next.next;
        }
        return current;
    }
}