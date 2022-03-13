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
    public ListNode deleteDuplicates(ListNode head) {
        TreeSet<Integer> set = new TreeSet<>();
        for(;head != null; head= head.next) set.add(head.val);
        ListNode new_head = null;
        for(Integer el: set) {
        ListNode current = new_head;
        ListNode node = new ListNode(el);
        if (current == null) {
            new_head = node;
        }
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }   
        }
        return new_head;
    }
}