class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length == 1) return 0;
        int count = 0;
        Arrays.sort(nums);
        if(k > 0) {
          int i = 0, j = 0;  
          while(j < nums.length) {
            if(i< nums.length) {
                if(Math.abs(nums[j]-nums[i]) == k) {     
                 if(nums[j] < nums[j+1] && nums[i-1] < nums[i]) { 
                     count++; 
                 }     
                 else {
                    i++; 
                    continue; 
                 }           
            }
            i++;
          } else {
                j++;
                i=j;
            }   
         }  
        } else {
            HashSet <Integer> common = new HashSet<>();
            int lastDuplicate = -1000001;
            int commonSize = 0;
            for(int i=0; i< nums.length; i++) {
                if(!common.contains(nums[i])) {
                   common.add(nums[i]);
                   commonSize++;
                } else if(common.contains(nums[i]) && commonSize == common.size() && lastDuplicate != nums[i]) {
                    count++;
                    lastDuplicate = nums[i];
                }
            }
        }
        return count;
    }
}
