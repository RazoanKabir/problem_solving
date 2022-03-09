class Solution {
    public String reversePrefix(String word, char ch) {
        int specificCharIndex = word.indexOf(ch);
        char[] charArray = word.toCharArray();
        int i = 0;
        while(i< specificCharIndex){
            char temp = charArray[i];
            charArray[i] = charArray[specificCharIndex];
            charArray[specificCharIndex] = temp;
            specificCharIndex--;
        i++;
        }
    
       return String.valueOf(charArray); 
    }
    
}
