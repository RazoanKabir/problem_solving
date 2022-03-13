boolean solution(String inputString) {
    String reverse = "";
    for(int i = inputString.length()-1; i >= 0 ; i--) {
        reverse= reverse+ inputString.charAt(i);
    }
    if(reverse.equals(inputString)) 
        return true; 
    else    
        return false;
}
