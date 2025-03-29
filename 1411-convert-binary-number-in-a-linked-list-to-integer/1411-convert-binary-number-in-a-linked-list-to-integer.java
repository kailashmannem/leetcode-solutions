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
    public int getDecimalValue(ListNode head) {
        int res = 0;
        while (head!=null) {
            if (head.val==1) {
                res <<= 1;
                res |= head.val;
            }
            else {
                res <<= 1;
            }
            head = head.next;
        }
        return res;
    }
}