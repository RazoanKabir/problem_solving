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
        ListNode a = new ListNode();
        a.next = head;
        ListNode f = a;
        ListNode s = a;
         
        for(int i=1; i<=n; i++) {
            f= f.next;
        }
        while(f.next != null) {
            f=f.next;
            s=s.next;
        }
        s.next= s.next.next;
        return a.next;
    }
}