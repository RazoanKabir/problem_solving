class Solution {
    int ans = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backTrack(nums, 0 ,-target); 
        return ans;
    }
    void backTrack(int[] nums, int pos, int sum) {
        if(pos == nums.length) {
            if(sum==0) {
                ans++;
            }
            return;
        }
        backTrack(nums, pos+1, sum + -nums[pos]); 
        backTrack(nums, pos+1, sum + nums[pos]);
    }
}
