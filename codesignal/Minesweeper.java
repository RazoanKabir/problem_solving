int[][] solution(boolean[][] matrix) {
    int[][] result = new int[matrix.length][matrix[0].length];
    
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j< matrix[0].length; j++) {
            int set = 0;
            if(i==0) {
              if(j==0){
                  if(matrix[i][j+1]== true) set++;
                  if(matrix[i+1][j]== true) set++;
                  if(matrix[i+1][j+1]== true) set++;
              } 
            else if(j== matrix[0].length -1){
                  if(matrix[i][j-1]== true) set++;
                  if(matrix[i+1][j-1]== true) set++;
                  if(matrix[i+1][j]== true) set++;
              }
              else {
                  if(matrix[i][j-1]== true) set++;
                  if(matrix[i+1][j-1]== true) set++;
                  if(matrix[i+1][j]== true) set++;
                  if(matrix[i+1][j+1]== true) set++;
                  if(matrix[i][j+1]== true) set++;
              }  
            }
            else if(i != 0 && i != matrix.length-1 && j==0){
                if(matrix[i-1][j]== true) set++;
                if(matrix[i-1][j+1]== true) set++;
                if(matrix[i][j+1]== true) set++;
                if(matrix[i+1][j]== true) set++;
                if(matrix[i+1][j+1]== true) set++;
            }
            else if(i== matrix.length-1){
               if(j==0){
                  if(matrix[i][j+1]== true) set++;
                  if(matrix[i-1][j]== true) set++;
                  if(matrix[i-1][j+1]== true) set++;
              } 
              else if(j== matrix[0].length -1){
                  if(matrix[i][j-1]== true) set++;
                  if(matrix[i-1][j-1]== true) set++;
                  if(matrix[i-1][j]== true) set++;
              }
              else {
                  if(matrix[i][j-1]== true) set++;
                  if(matrix[i-1][j-1]== true) set++;
                  if(matrix[i-1][j]== true) set++;
                  if(matrix[i-1][j+1]== true) set++;
                  if(matrix[i][j+1]== true) set++;
              }  
            }
            else if(i != matrix.length-1 && i != 0 && j==  matrix[0].length -1) {
                if(matrix[i-1][j]== true) set++;
                if(matrix[i-1][j-1]== true) set++;
                if(matrix[i][j-1]== true) set++;
                if(matrix[i+1][j-1]== true) set++;
                if(matrix[i+1][j]== true) set++;
            } else {
                if(matrix[i-1][j-1]== true) set++;
                if(matrix[i-1][j]== true) set++;
                if(matrix[i-1][j+1]== true) set++;
                if(matrix[i][j+1]== true) set++;
                if(matrix[i+1][j+1]== true) set++;
                if(matrix[i+1][j]== true) set++;
                if(matrix[i+1][j-1]== true) set++;
                if(matrix[i][j-1]== true) set++;
            }
            result[i][j] = set;
        }
    }
    return result;
}
