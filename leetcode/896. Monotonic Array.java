class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length <3) return true;
        boolean isMono = false;
        for(int i=0; i< nums.length-2; i++){
           if(nums[i]>=nums[i+1] && nums[i+1] >= nums[i+2]) {
              isMono = true; 
           } else {
               isMono = false;
               break;
           } 
        }
        if(!isMono){
            for(int i=0; i< nums.length-2; i++){
            if(nums[i]<=nums[i+1] && nums[i+1] <= nums[i+2]){
                isMono = true;
            } else {
                isMono= false;
                break;
            }
        }
        }
        return isMono;
    }
}
