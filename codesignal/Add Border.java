String[] solution(String[] picture) {
    String[] result = new String[picture.length+2];
    String highestAsterix = "";
    for(int i = 0; i< picture[0].length()+2; i++){
        highestAsterix = highestAsterix+"*";
    }
    for(int i= 1; i< result.length-1; i++){
        result[i]= "*"+picture[i-1]+"*";
    }
    result[0]=highestAsterix;
    result[result.length-1] = highestAsterix;
    return result;
}