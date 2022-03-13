boolean solution(int[] sequence) {
   int count1 = 0;
   int count2 = 0;
   
   for(int i=0; i< sequence.length-1;i++){
       if(sequence[i]>= sequence[i+1]) count1++;
   }
   for(int i=0; i< sequence.length-2;i++){
       if(sequence[i]>= sequence[i+2]) count2++;
   }
   return (count1<=1 && count2 <=1);
}
