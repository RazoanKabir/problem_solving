class Solution {
    public String reverseWords(String s) {
        String a = s.trim();
        a+=" ";
        String result = "";
        while(a.indexOf(" ") != -1){
            int idx = a.indexOf(" ");
            String word = a.substring(0, idx);
            result = word + " "+ result;
            a = a.substring(idx+1);
        }
        return result.trim().replaceAll(" +", " ");
    }
}