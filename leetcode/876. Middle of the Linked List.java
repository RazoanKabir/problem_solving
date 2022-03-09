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
    public ListNode middleNode(ListNode head) {
        ListNode fastPt = head;
        ListNode slowPt = head;
        while(fastPt != null && fastPt.next != null) {
            fastPt = fastPt.next.next;
            slowPt = slowPt.next;
        }
        return slowPt; 
    }
}
