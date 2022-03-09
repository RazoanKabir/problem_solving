class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2== null) return list1;
        ListNode result = null;
        if(list1.val > list2.val) 
            result = mergedNode(list2,list1);
        else
            result = mergedNode(list1,list2);
        
        return result;
    }
    
    static ListNode mergedNode(ListNode first, ListNode second) {
        if(first.next == null) { //if only one data in first, and first.val < second.val, then adding second after first and return first
            first.next = second;
            return first;
        }
        // setting current and next pointer of both lists
        ListNode curFirst = first;
        ListNode nextFirst = first.next;
        ListNode curSecond = second;
        ListNode nextSecond = second.next;
        
        while(nextFirst != null && curSecond != null) {
            //if curFirst<= curSecond >= nextFirst
            if(curSecond.val >= curFirst.val && curSecond.val <= nextFirst.val) {
                nextSecond = curSecond.next;
                curFirst.next = curSecond;
                curSecond.next = nextFirst;
                curFirst = curSecond;
                curSecond = nextSecond;     
            }
            else {
                // if there are more smaller values in first
                if(nextFirst.next != null){
                    nextFirst = nextFirst.next;
                    curFirst = curFirst.next;
                } else {
                    nextFirst.next = curSecond; // no next node left in first, to add first's tail node just before REST of the second's nodes
                    return first;
                }
            }
        } 
        return first;
    }
}
