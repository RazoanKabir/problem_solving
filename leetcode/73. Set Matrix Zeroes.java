class Solution {
    public void setZeroes(int[][] matrix) {
        String iZero = "";
        String jZero = "";
        for(int i=0; i< matrix.length; i++) {
            for(int j= 0; j< matrix[0].length; j++) {
                if(matrix[i][j]== 0) {
                    iZero = iZero+String.valueOf(i)+",";
                    jZero = jZero+String.valueOf(j)+",";
                }
            }
        }
        if(iZero.isEmpty()) return;
        String[] a = iZero.split(",",0);
        String[] b = jZero.split(",",0);
        for(int k=0; k<a.length; k++) {
            int i = Integer.parseInt(a[k]);
            int j = Integer.parseInt(b[k]);;
            for(int m=0;m< matrix.length; m++) matrix[m][j] = 0;
            for(int n=0;n< matrix[0].length; n++) matrix[i][n] = 0;
        }
    }
}
