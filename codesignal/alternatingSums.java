int[] solution(int[] a) {
    int team1= 0;
    int team2 = 0;
    
    for(int i=0; i< a.length; i++){
        if(i%2 == 0){
            team1= team1+a[i];
        } else team2= team2+a[i];
    }
    
    return new int[]{team1, team2}; 
}