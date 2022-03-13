class Solution {
    public int minSteps(String s, String t) {
        int count = 0;
        HashMap <Character, Integer> sMap = new HashMap<>();
        HashMap <Character, Integer> tMap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            if(sMap.containsKey(s.charAt(i))) 
                sMap.put(s.charAt(i), sMap.get(s.charAt(i))+1);
            else
                sMap.put(s.charAt(i), 1);
            if(tMap.containsKey(t.charAt(i))) 
                tMap.put(t.charAt(i), tMap.get(t.charAt(i))+1);
            else
                tMap.put(t.charAt(i), 1);
        }
        
        for(Map.Entry<Character, Integer> el: tMap.entrySet()) {
            char key = el.getKey();
            if(!sMap.containsKey(key)) 
                count += el.getValue();
            else if(sMap.containsKey(key) && el.getValue() > sMap.get(key)) 
                count += el.getValue()-sMap.get(key);
        }
        return count;
    }
}