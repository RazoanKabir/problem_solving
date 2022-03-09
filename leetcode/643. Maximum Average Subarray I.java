class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0.0;
        double max = 0.0;
        for(int i = 0; i< k; i++) {
            maxAvg += Double.valueOf(nums[i])/Double.valueOf(k);
            max = max+nums[i];
        }
        if(nums.length==k) return maxAvg;
        for(int i=k; i< nums.length; i++) {
            max += nums[i]-nums[i-k];
            maxAvg = Math.max((max/k), maxAvg);
        }
        return maxAvg;
    }
}
