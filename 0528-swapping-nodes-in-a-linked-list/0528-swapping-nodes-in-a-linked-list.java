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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode current = head, first = head, second = head;
        int count = 0;
        while (current!=null) {
            count++;
            current = current.next;
        }
        if (count%2!=0 && (count+1)/2 == k) {
            return head;
        }
        current = head;
        for (int i=1;i<=count;i++) {
            if (i==k) {
                first = current;
            }
            if (i==count-k+1) {
                second = current;
            }
            current = current.next;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
}