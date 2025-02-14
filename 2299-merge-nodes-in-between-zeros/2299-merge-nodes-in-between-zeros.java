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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        ListNode current = head;
        int sum = 0;
        while (current!=null) {
            sum += current.val;
            if (current.val==0 && sum!=0) {
                result.next = new ListNode(sum);
                result = result.next;
                sum = 0;
            }
            current = current.next;
        }
        return dummy.next;
    }
}