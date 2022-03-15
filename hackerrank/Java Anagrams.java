
  	static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        java.util.HashMap<Character, Integer> first= new java.util.HashMap<>();
        java.util.HashMap<Character, Integer> second= new java.util.HashMap<>();
        for(int i=0; i< a.length(); i++){
            char current = java.lang.Character.toLowerCase(a.charAt(i));
            if(first.containsKey(current)) {
                first.put(current, first.get(current)+1);
            } else first.put(current, 1);
        }
        for(int i=0; i< b.length(); i++){
            char current = java.lang.Character.toLowerCase(b.charAt(i));
            if(second.containsKey(current)) {
                second.put(current, second.get(current)+1);
            } else second.put(current, 1);
        }
        
        for(java.util.Map.Entry el: first.entrySet()) {
            Character value = (Character)el.getKey();
            if(!second.containsKey(value) || second.containsKey(value) && first.get(value) != second.get(value))
            return false;
        }
        return true;
    }

