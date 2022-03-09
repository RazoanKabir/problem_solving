class Solution {
    public long countPairs(int[] nums, int k) {
        long result = 0;
        HashMap<Integer, Integer> gmap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int currentGcd = gcdCal(nums[i], k);
            for(int num: gmap.keySet()) {
                if((long)currentGcd*num %k == 0) {
                    result = result+gmap.get(num);
                }
            }
            if(gmap.containsKey(currentGcd)) 
                gmap.put(currentGcd, gmap.get(currentGcd)+1);
            else 
                gmap.put(currentGcd,1);
        }
       return result; 
    }
    
    private int gcdCal(int n1, int n2) {
        if(n1 < n2) return gcdCal(n2, n1);
        if(n2==0) return n1;
        else return gcdCal(n2, n1% n2);
    }
}
