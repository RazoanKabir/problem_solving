class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) {
               if(check(s, i+1,j) || check(s, i,j-1)) {
                   return true;
               } else 
                   return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    static boolean check(String s, int i, int j) {
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
