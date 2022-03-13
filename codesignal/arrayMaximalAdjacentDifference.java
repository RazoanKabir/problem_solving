int solution(int[] inputArray) {
    int max = 0;
    for(int i=0; i<inputArray.length-1;i++) {
        int m = inputArray[i]-inputArray[i+1];
        if(Math.abs(m) > max) max= Math.abs(m);
    }
    return max;
}