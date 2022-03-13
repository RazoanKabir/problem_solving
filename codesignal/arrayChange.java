int solution(int[] inputArray) {
    int count = 0;
    for(int i=0; i< inputArray.length-1; i++){
        if(inputArray[i]>= inputArray[i+1]){
            if(inputArray[i+1] < 0){
                count = count + inputArray[i]+1-inputArray[i+1];
                inputArray[i+1] = inputArray[i]+1;
            } else {
               count = count + inputArray[i]-inputArray[i+1] +1;
            inputArray[i+1] = inputArray[i+1]+(inputArray[i]-inputArray[i+1])+1; 
            }
        }
    }
    return count;
}