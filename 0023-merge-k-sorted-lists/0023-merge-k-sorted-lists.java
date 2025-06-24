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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (node!=null) queue.add(node);
        }
        ListNode result = new ListNode(Integer.MIN_VALUE);
        ListNode tail = result;
        while (!queue.isEmpty()) {
            ListNode curr  = queue.poll();
            tail.next = curr;
            tail = tail.next;
            if (curr.next!=null) queue.add(curr.next);
        }
        return result.next;
    }
    // public ListNode mergeKLists(ListNode[] lists) {
    //     ListNode result = new ListNode(Integer.MIN_VALUE);
    //     for (int i = 0; i < lists.length; i++) {
    //         ListNode temp = lists[i];
    //         while (temp!=null) {
    //             insert(temp.val,result);
    //             temp = temp.next;
    //         }
    //     }
    //     return result.next;
    // }
    // private void insert(int val, ListNode head) {
    //     ListNode prev = null, curr = head;
    //     ListNode node = new ListNode(val);
    //     if (val <= head.val) {
    //         node.next = head;
    //         head = node;
    //         return;
    //     }
    //     while (curr != null && val >= curr.val) {
    //         prev = curr;
    //         curr = curr.next;
    //     }
    //     node.next = prev.next;
    //     prev.next = node;
    // }
}