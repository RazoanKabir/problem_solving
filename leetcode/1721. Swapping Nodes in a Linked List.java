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
        List<Integer> dummy = new ArrayList<>();
        ListNode new_head = new ListNode(0, null);
        ListNode node = new_head;
        for(;head != null; head=head.next) {
            dummy.add(head.val);
        }
        k--;
        int begin = dummy.get(k);
        int end = dummy.get(dummy.size()-1-k);
        dummy.set(k, end);
        dummy.set(dummy.size()-1-k, begin);
        int i=0;
        while(i<dummy.size()) {  
            node.next = new ListNode(dummy.get(i));
            node = node.next;    
            i++;
        }
        return new_head.next; 
    }
}
