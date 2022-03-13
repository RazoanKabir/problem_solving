class Solution {
    public String reverseParentheses(String s) {
        int start = -1;
        int end = -1;
        
        for(int i=0; i< s.length(); i++) {
            if(s.charAt(i)== '('){
                start = i;
            }
            if(s.charAt(i)== ')') {
                end = i;
                String reverse = new StringBuilder(s.substring(start+1, end)).reverse().toString();
                return reverseParentheses(s.substring(0, start)+reverse+s.substring(end+1));
            }
        }
        
        return s;
        
    }
}
