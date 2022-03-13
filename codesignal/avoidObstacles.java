int solution(int[] inputArray) {
    int jump = 2;
    for(int i=0; i<inputArray.length; i++){
        if(jump > inputArray[i]) continue;
        if(i== inputArray.length-1 && inputArray[i]%jump != 0) break;
        if(inputArray[i]%jump != 0) 
            continue;
        else if(inputArray[i]%jump == 0) {
            i= -1;
            jump++;
        }       
    }
    return jump;
}