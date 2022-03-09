class Solution {
    public int countElements(int[] nums) {
        if(nums.length <3) return 0;
        int min = 100001;
        int max = -100001;
        int result = 0;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > min && nums[i] < max) result++;
        }
        return result;
    }
}
