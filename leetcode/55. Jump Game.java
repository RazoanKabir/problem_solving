class Solution {
    public boolean canJump(int[] nums) {
      int jump = 0;
      for(int i = 0; i<= jump; i++) {
          if(i == nums.length-1) 
              return true;
          jump = Math.max(jump, i+nums[i]);
      }  
      
      return false;  
    }
}