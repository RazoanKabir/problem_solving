class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       HashSet<Character> set = new HashSet<>();
       char result = letters[0];  
       for(int i = 0; i<letters.length; i++) {
           set.add(letters[i]);
       }
       for(int i= (int)target+1; i<= (int)letters[letters.length-1]; i++) {
           if(set.contains((char)i)) {
               result = (char)i;
               break;
           } 
       }
       return result; 
    }
}
