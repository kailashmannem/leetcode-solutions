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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next==null) {
            return head;
        }
        ListNode current = head, future = head;
        while (current.next!=null && future.next!=null) {
            future = current.next;
            var insert = new ListNode(gcd(current.val,future.val));
            insert.next = future;
            current.next = insert;
            current = future;
        }
        return head;
    }

    public int gcd(int a, int b) {
        return (b==0)?a:gcd(b,a%b);
    }
}