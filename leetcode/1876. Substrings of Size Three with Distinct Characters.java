class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3) return 0;
        int count = 0;
        int f = 0;
        while(f+2 < s.length()) {
            char a = s.charAt(f);
            char b = s.charAt(f+1);
            char c = s.charAt(f+2);
            if(a != b  && a != c && b != c) count++;
            f++;
        }
        return count;
    }
}
