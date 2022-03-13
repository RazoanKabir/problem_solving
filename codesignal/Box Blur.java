int[][] solution(int[][] image) {
    int row = image.length-2;
    int column = image[0].length-2;
    int[][] result = new int[row][column];
    for(int i=0; i<row; i++){
        for(int j=0; j< column; j++) {
            int sum = Math.round((image[i][j]+ image[i][j+1]+image[i][j+2]+ image[i+1][j]+ image[i+1][j+1]+image[i+1][j+2]+ image[i+2][j]+ image[i+2][j+1]+image[i+2][j+2])/9);
            result[i][j]= sum;  
        }
    }
    return result;
}