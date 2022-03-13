class Solution {
    public boolean isValid(String s) {
        if(s.length()<2 || s.length()%2 != 0) return false;
        Stack<Character> charStack = new Stack<>();
        HashMap<Character, Character> hashChar= new HashMap<Character, Character>();
        hashChar.put(')','(');
        hashChar.put('}','{');
        hashChar.put(']','[');
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(!hashChar.containsKey(c)) charStack.push(c);
            else {
             char first= ' ';
             if(!charStack.isEmpty()) first = charStack.peek();
             if(first  != hashChar.get(c))
                    return false;
                else
                    charStack.pop(); 
            }
        }
         return charStack.isEmpty();
        
    }
}