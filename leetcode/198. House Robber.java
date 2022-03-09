class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int sum =0, pointer1 = nums[0], pointer2 = Math.max(nums[0], nums[1]);
        for(int i=2; i<nums.length; i++) {
            sum = Math.max(pointer1+nums[i], pointer2);
            pointer1 = pointer2;
            pointer2 = sum;
        }
        return sum;
    }
}
