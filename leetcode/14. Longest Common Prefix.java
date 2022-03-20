class Solution {
    public String longestCommonPrefix(String[] s) {
        if(s.length == 0) return "";
        String result = s[0];
        for(int i=1; i<s.length; i++) {
           while(s[i].indexOf(result) != 0) result = result.substring(0, result.length()-1);              
        }
        return result;
    }
}