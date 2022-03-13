int solution(int[][] matrix) {
     ArrayList<Integer> sum = new ArrayList<>();
     int total = 0;
     for(int i=0; i <matrix.length;i++){
         for(int j =0; j<matrix[i].length; j++) {
             if(matrix[0][j]== 0) continue;
             if(i==0 && matrix[i][j] > 0){
                 sum.add(matrix[i][j]);
             }
             else if(matrix[i][j] > 0 && matrix[i-1][j] > 0){
                 sum.add(matrix[i][j]);
             }
         }
     }
     for(int i=0; i< sum.size(); i++){
         total = total+ sum.get(i);
     }
     
     return total;
}
