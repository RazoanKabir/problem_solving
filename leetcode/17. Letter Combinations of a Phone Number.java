class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        ArrayList<String> result = check(digits, "");
        return result;
        
    }
    
    static ArrayList<String> check(String digits, String result) {
        if(digits.isEmpty()) {
            ArrayList<String> l = new ArrayList<>();
            l.add(result);
            return l;
        }
        int current = digits.charAt(0)-48;
        ArrayList<String> l = new ArrayList<>(); 
        if(current == 7) {
           for(int i= 15 ; i<= 18; i++) {
                l.addAll(check(digits.substring(1), result+(char)(97+i)));
            } 
        } else if(current == 8) {
           for(int i= 19 ; i<= 21; i++) {
                l.addAll(check(digits.substring(1), result+(char)(97+i)));
            } 
        } else if(current == 9) {
            for(int i= 22 ; i<= 25; i++) {
                l.addAll(check(digits.substring(1), result+(char)(97+i)));
            }
        }
        else{
           for(int i= ((current-1)*3)-3 ; i<=((current-1)*3)-1; i++) {
                l.addAll(check(digits.substring(1), result+(char)(97+i)));
            } 
        }    
        return l;    
    }
}
