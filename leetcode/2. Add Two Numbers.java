class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      String f = "", s = "";  
      while(l1 != null) {
          f = f+ String.valueOf(l1.val);
          l1= l1.next;
      }
      while(l2 != null) {
          s = s+ String.valueOf(l2.val);
          l2= l2.next;
      }
      java.math.BigInteger n = new java.math.BigInteger(new StringBuilder(f).reverse().toString());
      java.math.BigInteger m = new java.math.BigInteger(new StringBuilder(s).reverse().toString());  
      java.math.BigInteger a = n.add(m);  
      String plus = String.valueOf(a);
      ListNode head = null;  
      for(int i=plus.length()-1; i >= 0; i--) {  
        ListNode current = head;
        ListNode node = new ListNode(Character.getNumericValue(plus.charAt(i)));
        if (current == null) {
            head = node;
        }
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
      }
       return head; 
    }
}
