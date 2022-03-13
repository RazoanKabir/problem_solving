boolean solution(int n) {
int firstHalf= 0;
int secondHalf= 0;
for(int i=0; i< String.valueOf(n).length(); i++){
    if(i<String.valueOf(n).length()/2){
        firstHalf= firstHalf+ Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
    } else {
        secondHalf= secondHalf+ Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
    }
}
return (firstHalf==secondHalf);
}
