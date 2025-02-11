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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int count = 0;
        while (current!=null) {
            count += 1;
            current = current.next;
        }
        current = head;
        for (int i=0;i<count-n-1;i++) {
            current = current.next;
        }
        if (count==1 && current.next==null) {
            return null;
        }
        if (count==n) {
            head = head.next;
            return head;
        }
        current.next = (current.next.next!=null) ? current.next.next : null;
        return head;
    }
}