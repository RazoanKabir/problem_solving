class Solution {
    public int minOperations(int[] nums) {
    int count = 0;
    for(int i=0; i< nums.length-1; i++){
        if(nums[i]>= nums[i+1]){
            if(nums[i+1] < 0){
                count = count + nums[i]+1-nums[i+1];
                nums[i+1] = nums[i]+1;
            } else {
               count = count + nums[i]-nums[i+1] +1;
            nums[i+1] = nums[i+1]+(nums[i]-nums[i+1])+1; 
            }
        }
    }
    return count;
        
    }
}
