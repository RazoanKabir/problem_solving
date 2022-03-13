class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        HashMap<Character, Integer> w1 = new HashMap<>();
        HashMap<Character, Integer> w2 = new HashMap<>();
        for(int i=0; i<word1.length(); i++) {
            if(w1.containsKey(word1.charAt(i))) 
                w1.put(word1.charAt(i), w1.get(word1.charAt(i))+1);
            else 
                w1.put(word1.charAt(i), 1);
            
            if(w2.containsKey(word2.charAt(i))) 
                w2.put(word2.charAt(i), w2.get(word2.charAt(i))+1);
            else 
                w2.put(word2.charAt(i), 1);
        }
        ArrayList<Integer> wr1 = new ArrayList<>();
        ArrayList<Integer> wr2 = new ArrayList<>();
        for(Map.Entry<Character, Integer> el: w1.entrySet()) {
            char key = el.getKey();
            wr1.add(el.getValue());
            if(w2.get(key) != null)
                wr2.add(w2.get(key));
            else 
                return false;
        }
        Collections.sort(wr1);
        Collections.sort(wr2);
        return wr1.equals(wr2);
    }
}