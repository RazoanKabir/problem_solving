class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        boolean right = true, down = false, left = false, up = false;
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, total = matrix.length*matrix[0].length;
        while(total > 0) {
            if(right== true) {
                if(matrix[i][j] != -101) {
                    result.add(matrix[i][j]);
                    matrix[i][j] = -101;
                    total--;
                    if(j == matrix[0].length - 1) {
                        down = true;
                        right = false;
                        i++;
                    } else 
                        j++; 
                } else {
                    down = true;
                    right = false;
                    i++;
                    j--;
                }
            }
            else if(down == true) {
                if(matrix[i][j] != -101) {
                    result.add(matrix[i][j]);
                    matrix[i][j] = -101;
                    total--;
                    if(i == matrix.length -1) {
                        left = true;
                        down = false;
                        j--;   
                    } else
                        i++; 
                } else {
                    left = true;
                    down = false;
                    i--;
                    j--;
                }
            } else if(left == true) {
                if(matrix[i][j] != -101) {
                   result.add(matrix[i][j]);
                   matrix[i][j] = -101;
                   total--;
                   if(j==0) {
                        left = false;
                        up = true;
                        i--;                        
                    } else 
                        j--;
                } else {
                    left = false;
                    up = true;
                    i--;
                    j++;
                }
            } else if (up == true) {
                if(matrix[i][j] != -101) {
                   result.add(matrix[i][j]);
                   matrix[i][j] = -101;
                   total--;
                   i--;  
                } else {
                   right = true;
                   up = false;
                   i++;
                   j++; 
                } 
            }
        }
        return result; 
    }
}
