class Solution {
    public char findTheDifference(String s, String t) {
        char differ = t.charAt(s.length());
        for (int i = 0; i < s.length(); i++)
            differ += t.charAt(i) - s.charAt(i) ;
        return differ;
    }
}
