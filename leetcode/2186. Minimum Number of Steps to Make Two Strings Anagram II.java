class Solution {
    public int minSteps(String s, String t) {
        int count = 0;
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();
        
        for(int i=0; i< s.length(); i++) {
            if(first.containsKey(s.charAt(i))) first.put(s.charAt(i), first.get(s.charAt(i))+1);
            else first.put(s.charAt(i), 1);
        }
        for(int i=0; i< t.length(); i++) {
            if(second.containsKey(t.charAt(i))) second.put(t.charAt(i), second.get(t.charAt(i))+1);
            else second.put(t.charAt(i), 1);
        }
        for(Map.Entry<Character, Integer> el: second.entrySet()) {
            if(first.containsKey(el.getKey()) && first.get(el.getKey()) >= el.getValue()) 
                continue;
            else if(first.containsKey(el.getKey()) && first.get(el.getKey()) < el.getValue()) 
                count = count+ (el.getValue() - first.get(el.getKey()));
            else
                count = count + el.getValue();
        }
        for(Map.Entry<Character, Integer> el: first.entrySet()) {
            if(second.containsKey(el.getKey()) && second.get(el.getKey()) >= el.getValue()) 
                continue;
            else if(second.containsKey(el.getKey()) && second.get(el.getKey()) < el.getValue()) 
                count = count+ (el.getValue() - second.get(el.getKey()));
            else
                count = count + el.getValue();
        }
        
        return count;
    }
}
