class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int pLen= pref.length();
        for(int i= 0; i< words.length; i++) {
            if(words[i].length() >= pref.length()) {
                if(pref.equals(words[i].substring(0, pLen))) count++;    
            } 
        }
        return count;  
    }
}
