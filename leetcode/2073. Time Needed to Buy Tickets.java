class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        if(k==0 && t[k] == 1) return 1;
        int result = 0;
        while(t[k] != 0) {
            for(int i=0; i< t.length; i++) {
                if(t[i] > 0 && t[k] > 0){
                    t[i] = t[i]-1;
                    result++;
                }
            }
        }
        return result;
    }
}
