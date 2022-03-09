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
        if(head==null) return head;
        ListNode new_head = new ListNode(0, null);
        ListNode new_node = new_head;
        int count = 0;
        boolean counting = false;
        while(head != null) {
            if(head.val == 0 && count == 0) {
                counting = true;
                count += head.val;
            } else if(head.val > 0 && counting == true) {
                count += head.val;
            } else if(head.val == 0 && counting == true && count > 0) {
                new_node.next = new ListNode(count, null);
                new_node = new_node.next;
                count = 0;
                counting = false;
                continue;
            }
            head = head.next;
        }
        return new_head.next;
    }
}
