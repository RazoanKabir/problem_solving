class Solution {
     public char[][] updateBoard(char[][] board, int[] click) {
        result(board, click[0], click[1]);
        return board;
    }
   
    private void result(char[][] board, int i, int j) {
        if (checkIfOutOfBoard(board, i, j)) {
            return;
        }
        if (checkMine(board, i, j)) {
            board[i][j] = 'X';
            return;
        } 
        if (board[i][j] == 'E') {
            board[i][j] = 'B';
            int sum = 0;
            for (int a = -1; a < 2; a++) {
                for (int b = -1; b < 2; b++) {
                    if(checkIfOutOfBoard(board, i+a, j+b)) sum = sum + 0;
                    else {
                        if(checkMine(board, i+a, j+b)){
                            sum = sum+1;
                        } else sum = sum + 0;
                    }
                }
            }
            if (sum == 0) {
                for (int a = -1; a < 2; a++) {
                    for (int b = -1; b < 2; b++) {
                        result(board, i + a, j + b);
                    }
                }
            } else {
                board[i][j] = (char) (sum + '0');
            }
            return;
        }
    }
    
     private boolean checkIfOutOfBoard(char[][] board, int i, int j) {
        return i < 0 || i >= board.length || j < 0 || j >= board[0].length;
    }
    
    private boolean checkMine(char[][] board, int i, int j) {
        return board[i][j] == 'M' || board[i][j] == 'X';
    }
       
}
