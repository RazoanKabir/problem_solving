class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length) {
         int array[][]={};
         return array;   
        }
        int[][] result = new int[m][n];
        int j = 0;
        int k= 0;
        for(int i = 0; i< original.length; i++) {
            result[j][k] = original[i];
            if(k == n-1) {
                j++;
                k= 0;
            } else k++;
        }
        return result;
    }
}