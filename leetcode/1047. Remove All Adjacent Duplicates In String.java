class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st=new Stack<>();
       String result = "";
        for(int i=0;i<s.length();i++)
        { 
            char c = s.charAt(i);
            if(st.size()==0) {
                st.push(c);
            }
        
            else if(st.peek()==c) {
                st.pop();
            }
            else {
                st.push(c);
            }
        }
        while(st.size()>0){
            result = st.pop()+result;
        }
        return result;
    }
}