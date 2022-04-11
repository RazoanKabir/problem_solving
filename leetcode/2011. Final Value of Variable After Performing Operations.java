class Solution {
    public int finalValueAfterOperations(String[] op) {
        int result = 0;
        for(int i=0; i< op.length; i++) {
            if(op[i].contains("++")) {
                result++;
            } else if(op[i].contains("--")) {
                result--;
            }
        }
        return result;
    }
}