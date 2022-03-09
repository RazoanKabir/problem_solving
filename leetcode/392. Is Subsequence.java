class Solution {
    public boolean isSubsequence(String s, String t) {
      if(s.length()==0) return true;
      if(s.length() > 0 && t.length()==0) return false;  
        ArrayList<Character> mainS = new ArrayList<>();
        ArrayList<Character> mainT = new ArrayList<>();
        for(int i=0; i< s.length(); i++){
            mainS.add(s.charAt(i));
        }
        
        for(int i=0; i<t.length(); i++){
            if(mainS.isEmpty()) break;
            if(t.charAt(i)== mainS.get(0)) {
                mainS.remove(mainS.get(0));
            }
        }
        return mainS.isEmpty();
    }
}
