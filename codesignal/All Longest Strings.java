String[] solution(String[] inputArray) {
    ArrayList<String> result= new ArrayList<>();
    int maxChar= -1;
    for(int i =0; i<inputArray.length; i++){
        if(inputArray[i].length()> maxChar){
            maxChar = inputArray[i].length();
        }
    }
    for(int i =0; i<inputArray.length; i++){
        if(inputArray[i].length()== maxChar){
            result.add(inputArray[i]);
        }
    }
    return result.toArray(new String[result.size()]);
}