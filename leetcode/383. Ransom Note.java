class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom = new int[26];
        int[] mag = new int[26];

        for(int i=0;i<ransomNote.length();i++) {
             ransom[ransomNote.charAt(i)-97]++;
        }	
        for(int i=0;i<magazine.length();i++) {
            mag[magazine.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(ransom[i]>mag[i]) return false;
        }
        return true;
    }
}
