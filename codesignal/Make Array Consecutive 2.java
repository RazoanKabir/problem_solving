int solution(int[] statues) {
    int max= statues[0];
    int min = statues[0];
    for(int i = 0; i< statues.length; i++) {
        if(statues[i] > max){
            max = statues[i];
        } else if(statues[i] < min) {
            min = statues[i];
        }
    }
    return (max-(min+statues.length)+1);
}
