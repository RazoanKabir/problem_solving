class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1) return 0;
        Arrays.sort(nums);
        int n= k-1;
        int minDiff = Math.abs(nums[0]-nums[n]);
        for(int i=1; i<nums.length-n; i++) {
           int min = Math.abs(nums[i]-nums[i+n]);
           minDiff = Math.min(minDiff, min); 
        }
        return minDiff;
    }
}
