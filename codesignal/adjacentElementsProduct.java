int solution(int[] inputArray) {
    int max = inputArray[1]*inputArray[0];
    if(inputArray.length>2){
        for(int i =2; i< inputArray.length; i++){
            if(inputArray[i]*inputArray[i-1] > max) {
                max = inputArray[i]*inputArray[i-1];
            }
        }
    }
    return max;
}
