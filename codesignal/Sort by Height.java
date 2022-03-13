int[] solution(int[] a) {
   ArrayList<Integer> person = new ArrayList<Integer>();
   int[] result = new int[a.length];
   for(int i=0; i< a.length; i++){
       if(a[i]== -1){
           result[i]= -1;
       } else {
           person.add(a[i]);
       }
   }
   if(person.size()>0){
       Collections.sort(person);
       int i=0;
       int l=0;
       for(; i< a.length; i++){
         for(int j=l; j< person.size(); j++){
             if(result[i]== 0){
                 result[i]= person.get(l);
                 l++;
                 break;  
             }
         }
       }
   } else return a;
   
   return result;
    
}