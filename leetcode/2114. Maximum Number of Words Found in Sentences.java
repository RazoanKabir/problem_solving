class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;
        for(int i=0; i<s.length; i++) {
            String[] sp = s[i].split(" ");
            max = Math.max(sp.length, max);
        }
        return max;
    }
}