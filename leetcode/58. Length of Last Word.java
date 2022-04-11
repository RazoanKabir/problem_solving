class Solution {
    public int lengthOfLastWord(String s) {
        String a = s.trim().replaceAll(" +", " ");
        String[] sp = a.split(" ");
        return sp[sp.length-1].length();
    }
}