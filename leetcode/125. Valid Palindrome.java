class Solution {
    public boolean isPalindrome(String s) {
       String removed = "";
       for(int i=0; i< s.length(); i++) {
           char a = s.charAt(i);
           if(Character.isLetterOrDigit(a)) {
               if(a >= 65 && a <= 90) {
              int c = (int)a+32;
              if(c >= 97 && c <= 122) a = (char)c;
              else a= Character.MIN_VALUE;     
            } 
           } else continue;
           removed = removed+a;
       } 
       StringBuilder builder = new StringBuilder(removed);
       int length = builder.length(); 
       for (int i = 0; i < length / 2; i++) {  
           builder.setCharAt(i, builder.charAt(length - i - 1));  
           builder.setCharAt(length - i - 1, builder.charAt(i)); 
       }
        return (builder.toString().equals(removed));
    }
}
