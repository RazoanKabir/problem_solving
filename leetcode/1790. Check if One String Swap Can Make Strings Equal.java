class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length() != s2.length() || s1.length()==1 && s2.length()==1 && !s1.equals(s2)) return false;
        int count = 0;
        HashMap<Integer, Character> sMap1 = new HashMap<>();
        HashMap<Integer, Character> sMap2 = new HashMap<>();
        for(int i=0; i< s1.length(); i++) {
            sMap1.put(i, s1.charAt(i));
            sMap2.put(i, s2.charAt(i));
        }
        for(Map.Entry<Integer, Character> el: sMap1.entrySet()) {
           int key = el.getKey();
           if(el.getValue()!= sMap2.get(key) && sMap2.containsValue(el.getValue())) count++; 
           else if(el.getValue()!= sMap2.get(key) && !sMap2.containsValue(el.getValue())) return false; 
        }
        return (count==0 || count==2);
    }
}