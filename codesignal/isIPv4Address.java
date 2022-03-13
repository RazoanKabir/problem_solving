boolean solution(String inputString) {
    try{
        String[] ipv = inputString.split(Pattern.quote("."));
        if(ipv.length != 4) return false;
        for(String a: ipv){
        if(Integer.parseInt(a) > 255 ) {
            return false;
        }
        if(Integer.parseInt(a) < 10 && a.length()>1) return false;
    }
    return true;   
    } catch(Exception e){
        return false;
    }
}
