class Solution {
    public boolean backspaceCompare(String s, String t) {
        int a = 0;
        StringBuilder sb = new StringBuilder();
        while(a< s.length()) {
            if(s.charAt(a) != '#')
                sb.append(s.charAt(a));
            else if(sb.toString().length() > 0) 
                sb.deleteCharAt(sb.length()-1);
            a++;
        }
        a = 0;
        StringBuilder sbT = new StringBuilder();
        while(a< t.length()) {
            if(t.charAt(a) != '#') 
                sbT.append(t.charAt(a));
            else if(sbT.toString().length() > 0) 
                sbT.deleteCharAt(sbT.length()-1);
            a++;
        }
        return (sb.toString().equals(sbT.toString()));   
    }
}
